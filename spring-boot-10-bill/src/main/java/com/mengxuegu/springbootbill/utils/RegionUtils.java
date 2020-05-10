package com.mengxuegu.springbootbill.utils;

import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/*
@project:com.islandlxl.javalearning.JobStudy
@Title:RegionUtils
@Auther:lxl
@create:2020/5/10,10:41
*/public class RegionUtils {
    private static double EARTH_RADIUS = 6378137;

    //求角度  d为角度 例如d=30.就是30度的角度是多少PI
    private static double rad(double d){
        return d*Math.PI/180;
    }

    /*
    * 判断是否在多边形区域内
    * */
    public static boolean isInpolygon(double pointLon,double pointLat,double[] lon,double lat[]){

        Point2D.Double point=new Point2D.Double(pointLon,pointLat);
        //区域中的横纵坐标放到一个区域内
        List<Point2D.Double> pointList = new ArrayList<Point2D.Double>();

        double polygonPoint_x=0.0;double polygonPoint_y=0.0;

        for (int i = 0; i <lon.length ; i++) {
            polygonPoint_x=lon[i];
            polygonPoint_y=lat[i];
            Point2D.Double polygonPoint = new Point2D.Double(polygonPoint_x, polygonPoint_y);
           pointList.add(polygonPoint);
        }
        return check(point ,pointList);
    }

    public static boolean check(Point2D.Double point, List<Point2D.Double> pointList){

        GeneralPath generalPath = new GeneralPath();

        Point2D.Double frist = pointList.get(0);

        generalPath.moveTo(frist.x,frist.y);

        pointList.remove(point);
        for (Point2D.Double o :pointList) {
            generalPath.lineTo(o.x,o.y);
        }
        generalPath.lineTo(frist.x,frist.y);
        generalPath.closePath();

        return generalPath.contains(point);
    }

    /*经纬度获取两点距离*/

    public static double getDistance(double lng1,double lat1,double lng2,double lat2){

        double radlat1 = rad(lat1);

        double radlat2 = rad(lat2);

        double a=radlat1-radlat2;
        double b=rad(lng1)-rad(lng2);

        double s=2*Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)
                +Math.cos(radlat1)*Math.cos(radlat2)*Math.pow(Math.sin(b/2),2)));
        s=s*EARTH_RADIUS;
        s=Math.round(s*10000d)/10000d;
        return s;
    }

    public static boolean isInCicle(double lng1,double lat1,double lng2,double lat2,double radius){

        double distance = getDistance( lng1,lat1,lng2,lat2);

        if (distance>radius){
            return false;

        }else {
            return true;
        }
    }

    public static void main(String[] args) {
       double[] lng={112.586149,112.58464,112.585143,112.600953,112.607421,112.606631,112.606523,112.59772};
       double[] lat={26.913201,26.909432,26.899219,26.898832,26.900572,26.904825,26.909142,26.909399};

        boolean inpolygon = isInpolygon(112.606631, 26.904825, lng, lat);
        System.out.println("是否在多边行范围内："+inpolygon);


    }




}
