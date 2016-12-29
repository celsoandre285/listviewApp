package listview.cursoandroid.com.br.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    //Criando o componente da tela
    private ListView listaItens;
    private String[] itens = {
            "teste - 01", "teste - 02", "teste - 03", "teste - 04"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conectando ao compoente de tela
        listaItens = (ListView) findViewById(R.id.listviewItens);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1,
                itens
        );
        listaItens.setAdapter(adapter);
        //coloca ação no item clicado
        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                int codPosicao = position;
                String valorClicado = (String) listaItens.getItemAtPosition(codPosicao);
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
