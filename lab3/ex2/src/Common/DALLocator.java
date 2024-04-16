package Common;

import DAL.Abstruction.IData;
import DAL.Data;

public class DALLocator {
    private static IData data = new Data();

    public static IData getDalData() {
        return data;
    }
}
