package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLite_OpenHelper extends SQLiteOpenHelper {


    public SQLite_OpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      String query="create table usuarios(_ID integer primary key autoincrement, Usuario text, Password text);";
      db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //Permite abrir base de datos
 public void abrir(){ this.getWritableDatabase();}
     //Permite cerrar base de datos
    public void cerrar(){ this.close(); }

    //permite insertar registros en la tabla usuarios
    public void insertarRG(String usuario,String password){
        ContentValues valores=new ContentValues();
        valores.put("Usuario",usuario);
        valores.put("Password",password);
        this.getWritableDatabase().insert("usuarios",null,valores);
    }
}
