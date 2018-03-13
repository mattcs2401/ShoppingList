package mcssoft.com.shoppinglist.model.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "SHOPPING_ITEM")
public class ShoppingItem {
    // TBA

    //<editor-fold defaultstate="collapsed" desc="Region: Private">
    // Columns for SHOPPING_ITEM table.
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "_id") int id;                 // database row id.

    //</editor-fold>
}
