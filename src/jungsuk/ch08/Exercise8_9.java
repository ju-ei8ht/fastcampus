package javajungsuk.ch08.박주영;

public class Exercise8_9 {
    public static void main(String[] args) throws Exception{
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.",100);
    }
}

class UnsupportedFunctionException extends RuntimeException{
    private final int ERR_CODE = 100;

    public UnsupportedFunctionException(String s, int i) {
        super(s);
    }

    public int getERR_CODE(){
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "["+getERR_CODE()+"]"+super.getMessage();
    }
}
