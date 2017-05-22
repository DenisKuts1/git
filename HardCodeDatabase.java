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

        countries.add(new Country("Ukraine"));
        countries.add(new Country("Poland"));

        cities.add(new City("Lviv", countries.get(0)));
        cities.add(new City("Kyiv", countries.get(0)));

        cities.add(new City("Varshava", countries.get(1)));
        cities.add(new City("Gdansk", countries.get(1)));

        clients.add(new Client("Ivanov Ivan", "+380673939675"));
        clients.add(new Client("Petrov Petro", "+380992057704"));

        hotels.add(new Hotel("LvivHotel", cities.get(0), 4));
        hotels.add(new Hotel("KyivHotel", cities.get(1), 5));
        hotels.add(new Hotel("VarshavaHotel", cities.get(2), 5));
        hotels.add(new Hotel("GdanskHotel", cities.get(3), 3));

        vouchers.add(new Voucher(clients.get(0), hotels.get(1), new Date(2017,10, 5)));
        vouchers.add(new Voucher(clients.get(1), hotels.get(2), new Date(2017,9, 10)));

    }
}
