package pr2.demo.com.mycontacts;

import android.content.ContentValues;
import android.content.Context;

/**
 * Created by Administrator on 2016/10/23 0023.
 */
public class ContactsTable {
    private final static String TABLENAME = "contactsTable";
    private MyDB db;

    public ContactsTable(Context context){
        db = new MyDB(context);
        if(!db.isTableExists(TABLENAME)){
            String createTableSql = "CREATE TABLE IF NOT EXISTS" + TABLENAME+"(id_DB integer " +
            "primary key AUTOINCREMENT,"+
            User.NAME +"VARCHAR," +
            User.MOBILE +"VARCHAR," +
            User.QQ +"VARVHAR," +
            User.DANWEI +"VARCHAR," +
            User.ADDRESS+"VARCHAR)";
            db.createTable(createTableSql);
        }
    }
    public boolean addDate(User user){
        ContentValues values = new ContentValues();
        values.put(User.NAME,user.getName());
        values.put(User.MOBILE,user.getMobile());
        values.put(User.DANWEI,user.getDanwei());
        values.put(User.QQ,user.getQq());
        values.put(User.ADDRESS,user.getAddress());
        return db.save(TABLENAME,values);
    }
}
