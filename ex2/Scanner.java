package ex2;

public class Scanner {
    int upcCode;
    public int getUPCCode(){
        return upcCode;
    }
    
    public int scannedUPCCode (int UPCCode) {
        upcCode = UPCCode;
        return upcCode;
    }
}
