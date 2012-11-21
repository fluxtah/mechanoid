/*
 * Generated by Robotoworks Mechanoid
 */
package com.mechanoid.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.robotoworks.mechanoid.sqlite.MechanoidSQLiteOpenHelper;
import com.robotoworks.mechanoid.sqlite.SQLiteMigration;

import com.mechanoid.db.migrations.TestDBMigrationV2;
import com.mechanoid.db.migrations.TestDBMigrationV3;

public abstract class AbstractTestDBOpenHelper extends MechanoidSQLiteOpenHelper {
	public static final String DATABASE_NAME = "TestDB.db";

	public static final int VERSION = 3;

	public interface Tables {
		String TABLE_A = "table_a";
	}

	public AbstractTestDBOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(
			"create table table_a ( " +
			"_id integer primary key autoincrement " +
			") "
		);
	}

	@Override
	protected SQLiteMigration createMigration(int version) {
		switch(version) {
			case 2:
				return new TestDBMigrationV2();
			case 3:
				return new TestDBMigrationV3();
			default:
				throw new IllegalStateException("No migration for version " + version);
		}
	}
}
