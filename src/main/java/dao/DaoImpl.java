package dao;

public class DaoImpl implements IDao{


    @Override
    public double getData() {
        System.out.println("Version vase de donnees ");
        double t = 23;
        return t;
    }
}
