package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteur ");
        double tmp=6000;
        return tmp;
    }
}
