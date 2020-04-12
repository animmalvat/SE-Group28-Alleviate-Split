package com.animatrixz.alleviatesplit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;

public class AddNewInvoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_invoice2);
    }

    public void addNewEntry(View v) {
        //adding new ui element
        //getting table layout
        TableLayout table = findViewById(R.id.elements);
        TableRow table_row = new TableRow(this);
        EditText item_name = new EditText(this);
        item_name.setHint("Item name");
        TableRow.LayoutParams params = new TableRow.LayoutParams(
                0,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        Resources resources = this.getResources();
        int margin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, resources.getDisplayMetrics());
        params.setMargins(margin, 0, margin, 0);
        params.weight = 1;
        item_name.setLayoutParams(params);

        EditText price = new EditText(this);
        price.setHint("Value");
        price.setLayoutParams(params);

        Spinner owners = new Spinner(this);

        owners.setLayoutParams(params);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.owner, R.layout.support_simple_spinner_dropdown_item);
        owners.setAdapter(adapter);


        //adding these to a table row
        table_row.addView(item_name);
        table_row.addView(price);
        table_row.addView(owners);

        //adding row to table
        table.addView(table_row);
    }
}
