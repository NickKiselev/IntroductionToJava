package Task4.Exception;

public class CheckFile {

    public boolean isContains(String str, String sep) throws ContainsException {
        if(str.contains(sep)){
            return true;
        }else {
            throw new ContainsException("String doesn't contains /");
        }
    }
}
