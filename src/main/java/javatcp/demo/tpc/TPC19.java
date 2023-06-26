package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.MyUtil;

public class TPC19 {
    public static void main(String[] args) {
        // 1. Java 에서 제공해주는 class 들... (API)
        // 문자열(String)
        String str = new String("APPLE TEST ANYTHING");
        System.out.println("str = " + str.toLowerCase());

        // 2. 직접 만들어서 상용하는 class 들... DTO/VO, DAO, Utility... API
        MyUtil util = new MyUtil();
        int sum = util.hap();
        System.out.println(sum);

        // 3. 다른 회사에서 만들어 놓은 class 들... API
        // Gson -> Json : http://mvnrepository.com/
        Gson g = new Gson();
    }
}
