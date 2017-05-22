import entities.*;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by denak on 22.05.2017.
 */
public class HardCodeDatabase {
    private ArrayList<City> cities;
    private ArrayList<Client> clients;
    private ArrayList<Country> countries;
    private ArrayList<Hotel> hotels;
    private ArrayList<Voucher> vouchers;

    public HardCodeDatabase(){
        countries = new ArrayList<Country>();
        clients = new ArrayList<Client>();
        cities = new ArrayList<City>();
        hotels = new ArrayList<Hotel>();
        vouchers = new ArrayList<Voucher>();

        countries.add(new Country(0,"Ukraine"));
        countries.add(new Country(1,"Poland"));

        cities.add(new City(0,"Lviv", countries.get(0)));
        cities.add(new City(1,"Kyiv", countries.get(0)));
        cities.add(new City(2,"Varshava", countries.get(1)));
        cities.add(new City(3,"Gdansk", countries.get(1)));

        clients.add(new Client(0,"Ivanov Ivan", "+380673939675"));
        clients.add(new Client(1,"Petrov Petro", "+380992057704"));

        hotels.add(new Hotel(0,"LvivHotel", cities.get(0), 4));
        hotels.add(new Hotel(1,"KyivHotel", cities.get(1), 5));
        hotels.add(new Hotel(2,"VarshavaHotel", cities.get(2), 5));
        hotels.add(new Hotel(3,"GdanskHotel", cities.get(3), 3));

        vouchers.add(new Voucher(0, clients.get(0), hotels.get(1), new Date(2017,10, 5)));
        vouchers.add(new Voucher(1, clients.get(1), hotels.get(2), new Date(2017,9, 10)));
    }

}
