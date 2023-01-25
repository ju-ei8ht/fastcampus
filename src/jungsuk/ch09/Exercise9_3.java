package javajungsuk.ch09.박주영;

public class Exercise9_3 {
    public static void main(String[] args){
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        String[] split = fullPath.split("\\\\");
        for(int i=0; i<split.length-2; i++){
            path += split[i]+"\\";
        }
        path += split[split.length-2];
        fileName = split[split.length-1];

//        int pos = fullPath.lastIndexOf("\\");
//        if(pos != -1){
//            path = fullPath.substring(0,pos);
//            fileName = fullPath.substring(pos+1);
//        }

        System.out.println("fullPath: "+fullPath);
        System.out.println("path: "+path);
        System.out.println("fileName: "+fileName);
    }
}
