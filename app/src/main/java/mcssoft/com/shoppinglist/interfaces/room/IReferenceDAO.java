package mcssoft.com.shoppinglist.interfaces.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import mcssoft.com.shoppinglist.model.database.ReferenceValues;

@Dao
public interface IReferenceDAO {

    @Query("select count(*) from reference_values where ArchvFlag = :flag")
    public int getRefValsCount(String flag);

    @Query("select * from reference_values where ArchvFlag = :flag")
    public int getAllRefVals(String flag);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public List<Long> insertRefVals(List<ReferenceValues> lRefValues);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public int insertRefVal(ReferenceValues refVal);
}
