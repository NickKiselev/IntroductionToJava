package Task4.Checking;

import Task4.Except.ContainsException;

import java.util.logging.Logger;

public class CheckFile {

    private final Logger log = Logger.getLogger(String.valueOf(CheckFile.class));

    public boolean isContains(String str, String sep) throws ContainsException {
        if(str.contains(sep)){
            return true;
        }else {
            throw new ContainsException("String doesn't contains /");
        }
    }
}
