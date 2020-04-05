package com.pix;

public class Main {

    public static void main(String[] args) {
        Logger.d("run...");
        init();
    }
    private static void init() {
        Logger.d("run...");
    }

    static class Logger {
        static void d(String msg) {
//            for (int i = 0; i < (new Throwable()).getStackTrace().length; i++)
//            {
//                StackTraceElement s = (new Throwable()).getStackTrace()[1];
////            System.out.format(" ClassName:%d\t%s\n", i, s.getClassName());
////            System.out.format("MethodName:%d\t%s\n", i, s.getMethodName());
////            System.out.format("  FileName:%d\t%s\n", i, s.getFileName());
////            System.out.format("LineNumber:%d\t%s\n\n", i, s.getLineNumber());
//                if(i==1) {
//                    System.out.println("TAG:" + c.getName() + "："+ s.getLineNumber() +"," + s.getMethodName() + "()," + msg);
//                }
//            }

            StackTraceElement s = (new Throwable()).getStackTrace()[1];
            System.out.println("TAG:" + s.getClassName() + "："+ s.getLineNumber() +"," + s.getMethodName() + "()," + msg);
        }
    }
}
