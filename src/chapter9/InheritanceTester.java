package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {
        String tmp = "Date/Time<div class=\\\"SVGIcon sort-arrow icon-arrowCircleDown\\\" data-component-name=\\\"SVGIcon\\\" style=\\\"height: 14px;\\";
        String[] split = tmp.split("<div");
        System.out.println(split);
        System.out.println(split[0]);
    }
}