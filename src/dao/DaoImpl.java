package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Database");
        double temp = Math.random()*40;
        return temp;
    }
}
