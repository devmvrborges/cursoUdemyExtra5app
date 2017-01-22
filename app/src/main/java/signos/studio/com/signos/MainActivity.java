package signos.studio.com.signos;

/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 18/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Lista de signos e com 2 Strings uma com o titulo para a listView
e outra com a descrição para aparecer no Toast

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSigno;
    private String[] signos = {
            "Áries", "Touro", "Gêmeos",
            "Câncer", "Leão", "Virgem",
            "Libra", "Escorpiao", "Sagitário",
            "Capricornio", "Aquário", "Peixes"};
    private String[] perfis = {
            "Áries - DESCRIÇÃO", "Touro - DESCRIÇÃO", "Gêmeos - DESCRIÇÃO",
            "Câncer - DESCRIÇÃO", "Leão - DESCRIÇÃO", "Virgem - DESCRIÇÃO",
            "Libra - DESCRIÇÃO", "Escorpiao - DESCRIÇÃO", "Sagitário - DESCRIÇÃO",
            "Capricornio - DESCRIÇÃO", "Aquário - DESCRIÇÃO", "Peixes - DESCRIÇÃO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaSigno = (ListView) findViewById(R.id.listViewId);
        //adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos);
        listaSigno.setAdapter(adaptador);
        listaSigno.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               int codigoPosicao = position;
                Toast.makeText(getApplicationContext(),perfis[codigoPosicao],Toast.LENGTH_SHORT).show();
            }
        });

    }
}
