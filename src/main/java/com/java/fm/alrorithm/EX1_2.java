package com.java.fm.alrorithm;

import java.lang.*;
import java.io.*;


/*
    ay : 중력 가속도
    pi : π(파이)  -> 라디안으로 변환 해주기 위해서
    x : x좌표
    y : y좌표
    v : 초기 속도
    angle : 날아가는 각도
    nbounce : 몇번 땅에 닿고 종료할지
    tstep : 시간 증가치
    t : 시간
 */

class BouncingBall {
    final static float pi=3.1415926f;
    final static float ay=-9.8f;
    public int bounce, nbounce;
    public float v, angle, tstep, x, y, theta, vx, vyold, vynew, t;
    public String StrX = new String();
    public String StrY = new String();

    public BouncingBall() {
        v = 10.0f;
        angle = 80.0f;
        nbounce = 3;
        tstep = 0.10f;
        x = 0.0f;
        y = 0.0f;
        theta = angle * pi / 180;
        vx = v * (float) Math.cos(theta);
        vyold = v * (float) Math.sin(theta);

        bounce = 0;
        t = 0.0f;
    }

    public void ConvDataToString(){
        int i, len;

        StrX = "";
        StrX = StrX.valueOf(x);
        len = StrX.length();
        if(len < 8)
            for(i = 0; i < (8-len); i++)
                StrX = StrX + "0";
        else if(len > 8)
            StrX = StrX.substring(0,8);

        StrY = "";
        StrY = StrY.valueOf(y);
        len = StrY.length();
        if(len < 8)
            for(i = 0; i < (8-len); i++)
                StrY = StrY + "0";
        else if(len > 8)
            StrY = StrY.substring(0,8);

    }

    public void ComputeBouncingBall() {
        int b;

        PrintWriter out=null;

        try {
            File f = new File("C:\\WORK\\EX1_2.OUT");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);

            out.println("  BOUNCING BALL SIMULATION");
            out.println("=============================");
            out.println(" X-CORDINATE	 Y-CORDINATE");

            while (bounce < nbounce) {
                t = t + tstep;
                x = x + vx * tstep;
                vynew = vyold + ay * tstep;
                y = y + (vyold + vynew) * tstep / 2.0f;
                vyold = vynew;

                ConvDataToString();
                out.print(" " + StrX + "        " + StrY);


                for (b = 0; b < Math.round(y * 3); b++) {
                    out.print("  ");
                }
                out.println("��");

                if (y < 0.0) {
                    vyold = Math.abs(0.75f * vyold);
                    y = 0.0f;
                    ++bounce;
                }
            }
        } catch(IOException ioe) { }
        finally {
            if (out != null) out.close();
        }
    }
}

public class EX1_2 {
    public static void main(String[] args) {
        BouncingBall b = new BouncingBall();
        b.ComputeBouncingBall();
    }
}
