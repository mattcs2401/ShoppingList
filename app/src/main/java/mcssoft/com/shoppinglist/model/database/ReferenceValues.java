package mcssoft.com.shoppinglist.model.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "REFERENCE_VALUES")
public class ReferenceValues {

    //<editor-fold defaultstate="collapsed" desc="Region: Constructors">
    public ReferenceValues() {
        archvFlag = "N";
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Region: Getter/Setter">
    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    @NonNull
    public String getRefCode() {
        return refCode;
    }

    public void setRefCode(@NonNull String refCode) {
        this.refCode = refCode;
    }

    @NonNull
    public String getRefDesc() {
        return refDesc;
    }

    public void setRefDesc(@NonNull String refDesc) {
        this.refDesc = refDesc;
    }

    @NonNull
    public String getRefValue() {
        return refValue;
    }

    public void setRefValue(@NonNull String refValue) {
        this.refValue = refValue;
    }

    @NonNull
    public String getArchvFlag() {
        return archvFlag;
    }

    public void setArchvFlag(@NonNull String archvFlag) {
        this.archvFlag = archvFlag;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Region: Private">
    // Columns for REFERENCE_VALUES table.
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "_id") int id;                 // database row id.

    @NonNull
    @ColumnInfo(name = "RefCode") String refCode;     // e.g. "FANDV"
    @NonNull
    @ColumnInfo(name = "RefDesc") String refDesc;     // e.g. "Fruit&Veg"
    @NonNull
    @ColumnInfo(name = "RefValue") String refValue;   // e.g. "Tomato"
    @NonNull
    @ColumnInfo(name = "ArchvFlag") String archvFlag; // e.g. "N"
    //</editor-fold>

}
