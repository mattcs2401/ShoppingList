package mcssoft.com.shoppinglist.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import mcssoft.com.shoppinglist.interfaces.room.IReferenceDAO;
import mcssoft.com.shoppinglist.interfaces.room.IShoppingDAO;
import mcssoft.com.shoppinglist.model.database.ReferenceValues;
import mcssoft.com.shoppinglist.model.database.ShoppingItem;

@Database(entities = {ShoppingItem.class, ReferenceValues.class}, version=1, exportSchema = false)
public abstract class RaceDatabase extends RoomDatabase {

    static synchronized public RaceDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    public abstract IShoppingDAO getShoppingDAO();
    public abstract IReferenceDAO getReferenceDAO();

    private static RaceDatabase create(final Context context) {
        return Room.databaseBuilder(context, RaceDatabase.class, "SHOPPINGLIST").build();
    }

    private static volatile RaceDatabase instance;
}
