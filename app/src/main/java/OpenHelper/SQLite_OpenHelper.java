package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.mikea.vurro.Usuario;

import java.util.ArrayList;

public class SQLite_OpenHelper extends SQLiteOpenHelper {

    private static SQLiteDatabase db;

    public SQLite_OpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table if not exists usuarios(_ID integer primary key autoincrement,Usuario text   not null , Password text not null  );";
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
    //Metodo que permite validar si el usuario existe

    private Cursor getDataUsr(String usr, String pwd) {
        db = this.getReadableDatabase();
        Cursor res;
        res = db.rawQuery("SELECT Usuario, Password FROM usuarios WHERE Usuario = '" + usr + "' AND Password = '" + pwd + "'", null);
        return res;
    }

    public ArrayList<String> getUserPrefs(String usr, String pwd) {
        Cursor res = getDataUsr(usr, pwd);
        ArrayList<String> credenciales = new ArrayList<>();

        res.moveToFirst();

        while (!res.isAfterLast()) {
            credenciales.add(res.getString(res.getColumnIndex("Usuario")));
            credenciales.add(res.getString(res.getColumnIndex("Password")));
            res.moveToNext();
        }

        db.close();

        return credenciales;
    }
        //Modificacion

    public ArrayList <String> llenar_lista (){

        ArrayList<String> lista = new ArrayList<>();
        SQLiteDatabase database = this.getReadableDatabase();
        String q = "SELECT * FROM usuarios";
        Cursor usuarios = database.rawQuery(q,null);

        usuarios.moveToFirst();
        while(!usuarios.isAfterLast())
        {
            lista.add(usuarios.getString(1));
            usuarios.moveToNext();
        }
        return lista;
    }

}

