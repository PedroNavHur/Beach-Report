package com.navhur.spaceappschallengepre_alpha;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BeachesListActivity extends AppCompatActivity {
    private List<Beach> beachList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BeachAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches_list);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BeachAdapter(beachList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
        prepareBeachData();

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Beach beach = beachList.get(position);
                Toast.makeText(getApplicationContext(), beach.getTittle() + " is selected!", Toast.LENGTH_SHORT).show();

                Context context = view.getContext();
                Intent intent = new Intent(context, BeachInfoActivity.class);
                intent.putExtra("title_key", beach.getTittle());
                intent.putExtra("location_key", beach.getLocation2());
                intent.putExtra("description_key", beach.getDescription());
                intent.putExtra("temperature_key", beach.getTemperature());
                intent.putExtra("wind_key", beach.getWind());
                intent.putExtra("precipitation_key", beach.getPrecipitation());
                intent.putExtra("humidity_key", beach.getHumidity());
                intent.putExtra("uvlight_key", beach.getUvlight());
                intent.putExtra("visibility_key", beach.getVisibility());
                intent.putExtra("url_key", beach.getUrl());
                context.startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


    }

    private void prepareBeachData(){
        Beach beach = new Beach("San Juan del Sur",
                "San Juan del Sur, Rivas","11.258975, -85.875848",
                "Nicaragua",
                "Preciosa bahía en forma de medialuna, rodeada de picos montañosos, es el destino turístico más popular en Nicaragua. Es uno de los dos puertos del país que recibe cruceros internacionales.",
                "34°","23 km/h",
                "20%","65%",
                "10","14 KM",
                "http://property-nicaragua.com/pedrodev/wp-content/uploads/2015/01/san-juan-del-sur-bay-REMAX-Slider.012615.jpg");
        beachList.add(beach);

        beach = new Beach("Playa la Flor",
                "San Juan del Sur, Rivas","11.142666, -85.794683",
                "Nicaragua",
                "Playa La Flor es reserva natural, una de las pocas playas en el mundo donde las tortugas Paslama llegan a dejar sus huevos. La reserva mide más de 3,000 hectáreas y está a 22 kilómetros de San Juan del Sur.",
                "34°","23 km/h",
                "20%","65%",
                "10","14 KM",
                "http://www.go2sanjuandelsur.com/albums/folder_57/35682213.jpg");
        beachList.add(beach);

        beach = new Beach("Playa Maderas",
                "San Juan del Sur, Rivas", "11.294412, -85.910747 ",
                "Nicaragua",
                "Una de las playas más atractivas para los amantes del surf, ya que aquí se forman buenas y constantes olas para practicar este deporte. Es poco habitada, aunque hay opciones de hospedaje y camping. Se encuentra a unos 25 minutos de la ciudad San Juan del Sur, yendo en vehículo..",
                "34°","  3.25km/h",
                "23%","45%",
                "3-5"," 22 KM",
                "http://www.orotravel.com/images/playa-maderas-beach-oro-travel-discover-nicaragua-tour.jpg");
        beachList.add(beach);

        beach = new Beach("Playa Majagual (San Lorenzo)",
                "San Juan del Sur, Rivas", "11.299880, -85.915867",
                "Nicaragua",
                "La playa de Majagual está en una bahía privada y amplia, con vistas impresionantes. Es conocida por su ambiente propicio para relajarse y por sus formaciones rocosas que exaltan los atardeceres. Nadar, pescar, surfear y acampar, son las actividades que se pueden realizar en esta en esta playa..",
                "33°","3 km/h",
                "38%","45%",
                "3-5"," 21KM",
                "http://www.go2sanjuandelsur.com/albums/folder_62/playa-majagual-nicaragua.jpg");
        beachList.add(beach);

        beach = new Beach("Playa Marsella",
                "San Juan del Sur, Rivas", "11.285519, -85.903201",
                "Nicaragua",
                "Esta bahía de pescadores y casas veraniegas se encuentra justo al lado de San Juan del Sur, a solo 5 km hacia el Norte. Un pequeño estero llega hasta el mar, y frente a la playa en el agua se puede apreciar una roca a la que llegan aves marinas..",
                "34°","4 km/h",
                "38%","45%",
                "7"," 19KM",
                "http://www.san-juan-del-sur-info.com/images/marsella-beach.jpg");
        beachList.add(beach);

        beach = new Beach("Playa Ocosme",
                "San Juan del Sur, Rivas", "12.857168, -87.619381",
                "Nicaragua",
                "Es una playa en el departamento de Chinandega, y es muy recomendada  entre los amantes de la pesca. No cuenta con opciones de alojamiento, pero es accesible desde las playas cercanas (Mechapa).",
                "34°"," 4 km/h",
                "38%","45%",
                "6"," 10 KM",
                "https://chinandeganic.neocities.org/Imagenes/Papayal.jpg");
        beachList.add(beach);

        beach = new Beach("Playa Mechapa",
                "San Juan del Sur, Rivas", "12.828753, -87.574239",
                "Nicaragua",
                "Esta en el departamento de Chinandega, en el municipio El Viejo.",
                "35°"," 4 km/h",
                "0%","48%",
                "10"," 9 KM",
                "http://www.hotelroomsearch.net/im/city/mechapa-nicaragua-7.jpg");
        beachList.add(beach);

        beach = new Beach("Playa Santa Maria del Mar",
                "San Jaun del Sur, Rivas", "12.655048, -87.375191",
                "Nicaragua",
                "Una playa muy visitada por los locales, en el municipio El Viejo, departamento de Chinandega.",
                "35°","6 km/h",
                "0%","48%",
                "10"," KM",
                "http://du4zwgdg3nwxa.cloudfront.net/fotos/m/mm/mmahtscm-1421954165-700x525.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Poneloya",
                "Leon, Leon", "12.375844, -87.041485",
                "Nicaragua",
                "Poneloya es un pueblo pesquero de una sola calle paralela al mar; y un centro de casas de veraneo. La playa es irregular y de arena oscura, y deja ver palmeras que completan su aspecto de playa tropical. Es conocida por los nicaragüenses como una playa en cuyas aguas se presentan fuertes corrientes y olas que rompen con fuerza sobre la arena..",
                "32°"," 4 km/h",
                "8%","51%",
                "8","6 KM",
                "http://laprensa-bucket.s3-us-west-2.amazonaws.com/wp-content/uploads/2015/06/07060000/le%C3%B3n.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Las Peñitas",
                "Leon, Leon", "12.361363, -87.025244 ",
                "Nicaragua",
                "La playa Las Peñitas, ubicada en el departamento de León, es una de las 10 mejores playas de Centroamérica, seleccionadas con base en la calidad y cantidad de comentarios y calificaciones de los usuarios de Tripadvisor en 2015. La playa ubicada en la entrada a la Reserva Juan Venado tiene un paisaje idílico. El agua del río es cristalina y de temperatura agradable.",
                "33°"," 3 km/h",
                "8%","51%",
                "7"," 6 KM",
                "http://stophavingaboringlife.com/images/dec11/beach_las_penitas_nicaragua.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Hermosa",
                "San Juan del Sur, Rivas",  "12.109604, -86.737165",
                "Nicaragua",
                "Es una playa privada que se encuentra a 12 kilómetros de San Juan del Sur. Cuenta con arena blanca,  olas perfectas para el surf y una vista  impresionante desde Nicaragua a Costa Rica. .",
                "35°"," 6 km/h",
                "0%","48%",
                "7","8 KM",
                "http://content.vivatropical.com/2014/09/playa-hermosa-costa-rica-01.jpg");

        beachList.add(beach);
        beach = new Beach("Playa San Diego",
                "Villa Carlos Fonseca, Managua", "11.898520, -86.608519",
                "Nicaragua",
                "Se encuentra en el municipio de Villa Carlos Fonseca, y es de desarrollo turístico reciente. En Playa San Diego se ubica uno de los rompeolas más permanentes del país. Esto, debido a los vientos provenientes del Lago Cocibolca que le dan buena consistencia a las olas de esta costa..",
                "36°","10 km/h",
                "7%","50%",
                "7"," 10 KM",
                "https://i.ytimg.com/vi/S6zA55FHnQU/hqdefault.jpg");
        beachList.add(beach);
        beach = new Beach("Playa Montelimar",
                "Managua, Managua", "11.815657, -86.528217",
                "Nicaragua",
                "Montelimar es una playa localizada en la Costa del Pacífico de Nicaragua en el departamento de Managua.1 , y consiste de 3 km de playa de arenas blancas.",
                "36°"," 10 km/h",
                "7%","50%",
                "6"," 10 KM",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Playa_Montelimar.jpg/1200px-Playa_Montelimar.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Masachapa",
                "Masachapa, Managua", "11.788497, -86.516988",
                "Nicaragua",
                "En esta playa se pueden apreciar impresionantes atardeceres, por su amplitud y planicie. Es muy concurrida por los turistas nacionales. Por ser ubicada en un pueblito de pescadores, se puede apreciar lanchas cargadas de pescado y marisco, que se puede comprar ahí mismo.",
                "36°"," 9km/h",
                "7%","50%",
                "7"," 10 KM",
                "http://fromnicaragua.com/wp-content/uploads/2015/03/masachapa.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Pochomil",
                "Pochomil, Managua", "11.770891, -86.506552 ",
                "Nicaragua",
                "Esta playa es amplia, plana y alargada, es junto con Masachapa una de las más cercanas a Managua, por lo que también es una de las más visitadas en temporadas vacacionales; el resto del año, sin embargo, es muy poco frecuentada.",
                "34°"," 8 km/h",
                "8%","42%",
                "8","10 KM",
                "https://s-media-cache-ak0.pinimg.com/736x/94/06/25/940625647dd44e3fa03ad3d263182f8c.jpg");

        beachList.add(beach);
        beach = new Beach("Playa La Boquita",
                "La Boquita, Carazo", "11.770891, -86.506552",
                "Nicaragua",
                "Esta playa tiene zonas rocosas sobre las que puede tomar el sol, y también zonas despejadas ideales para el baño. Es una de las más visitadas de la zona, gracias a su muy conocido Centro Turístico.",
                "32°"," 18 km/h",
                "7%","64%",
                "3"," 10 KM",
                "https://s3-us-west-2.amazonaws.com/files.turismocolima.com/places/e7ed9-boquita_8.jpg");
        beachList.add(beach);
        beach = new Beach("Playa Casares",
                "Casares, Carazo", "11.646592, -86.359455",
                "Nicaragua",
                "Es una playa rocosa habitada sobretodo por pescadores, en la que se pueden encontrar muchas casas particulares. En la costa se pueden apreciar interesantes entradas de la marea sobre las rocas, dando lugar a imágenes espectaculares.",
                "36°"," 12 km/h",
                "40%","50%",
                "5"," 10 KM",
                "http://www.nicaragualinda.com/wp-content/gallery/july-2012-casares/playa-de-casares-carazo-nicaragua-107.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Huehuete",
                "Jinotepe, Carazo", "11.615373, -86.323702",
                "Nicaragua",
                "Esta playa tiene solo un kilómetro de costa frente al océano Pacífico. Es una playa de arena oscura presenta áreas planas y también rocosas; y ofrece un espacio con privacidad para el turismo de sol y playa.",
                "35°","12 km/h",
                "25%","7%",
                "7"," 10 KM",
                "https://i.ytimg.com/vi/Fa9jUcl2ZPI/maxresdefault.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Tupilapa",
                "Tupilapa, Carazo", "11.604252, -86.299331",
                "Nicaragua",
                "Se encuentra a 20 minutos de Diriamba, en la misma línea que las playas La Boquita, Casares, Huehuete, con características similares.",
                "36°"," 12 km/h",
                "25%","7%",
                "7","10 KM",
                "http://www.diriamba.info/Di_767.jpg");


        beachList.add(beach);
        beach = new Beach("Playa Gavilan",
                "San Juan del Sur, Rivas", "11.489521, -86.162029",
                "Nicaragua",
                "Una playa recomendada para los surfistas, ubicada en El Astillero, al sur de San Juan del Sur.",
                "35°","6 km/h",
                "0%","48%",
                "8"," 10 KM",
                "http://images.travelpod.com/users/nicanathalie/1.1240361700.playa-marsella.jpg");


        beachList.add(beach);
        beach = new Beach("Playa Popoyo",
                "Tola, Rivas", "11.469408, -86.123383",
                "Nicaragua",
                "Una playa predilecta de surfistas. Las olas de Popoyo rompen sobre un arrecife de piedras, lo que hace que revienten siempre en un mismo lugar, es principalmente una ola de izquierda larga y empinada.",
                "34°","10 km/h",
                "6%","64%",
                "7","10 KM",
                "https://wildchld.files.wordpress.com/2015/02/img_7101-kopio.jpg");


        beachList.add(beach);
        beach = new Beach("Playa Guasacate ",
                "Popoyo, Rivas", "11.464210, -86.115208",
                "Nicaragua",
                "Otra de las playas con olas aptas para el deporte del surf a lo largo de una linea costera de 30km (desde Manzanillo a Chacocente), ubicada en el municipio de Tola. Es vecina de la playa Popoyo, y es ideal para el turismo de sol y playa.",
                "34°","10 km/h",
                "6%","64%",
                "7","10 KM",
                "http://static.panoramio.com/photos/large/79126683.jpg");


        beachList.add(beach);
        beach = new Beach("Playa Santana ",
                "Jiquelete, Rivas", "11.446782, -86.092693",
                "Nicaragua",
                "Una de las cinco playas bellas de Rivas, ubicada en Jiquelite",

                "34°","10 km/h",
                "6%","64%",
                "8","10 KM",
                "https://www.nicaraguasurfingrental.com/wp-content/uploads/2016/11/playa-santana-2-1200x803.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Jiquiliste ",
                "Jiquiliste, Rivas", "11.444994, -86.089488",
                "Nicaragua",
                "Playa Jiquiliste, en Rivas, también pertenece al top 5 de los mejores lugares para surfear en nuestro país. Aquí se celebró el Campeonato de Surf World Junior en el año 2013. Los vientos marinos de la zona y la calidad de las olas hacen que los deportistas la prefieran.",
                "34°","10 km/h",
                "6%","64%",
                "8","10 KM",
                "http://www.goneonawhim.com/wp-content/uploads/2013/11/IMG_2694.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Escondida ",
                "San Juan del Sur, Rivas", "11.425667, -86.073550",
                "Nicaragua",
                "Es una playa perfecta para aquellos que necesitan planificar una escapada de fin de semana a algún sitio donde predomine la tranquilidad y sobre todo se pueda descansar. Esta playa tiene solamente acceso si lo haces caminando o por medio de navíos",
                "34°"," 20 km/h",
                "24%","57%",
                "6","10 KM",
                "https://s-media-cache-ak0.pinimg.com/736x/c4/ae/2a/c4ae2ac44e4d426d0559e511f0c8e2c9.jpg");


        beachList.add(beach);
        beach = new Beach("Playa Los Perros",
                "San Juan del Sur, Rivas", "11.413693, -86.068341",
                "Nicaragua",
                "Una playa de surf, contiguo a Playa Santana",
                "34°"," 20 km/h",
                "24%","57%",
                "6","10 KM",
                "https://michaeldouglasyoung.files.wordpress.com/2013/01/380354_2495787646827_861540847_n.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Amarilla ",
                "Tola, Rivas", "11.399157, -86.038596 ",
                "Nicaragua",
                "Playa amarilla en el municipio de Tola, un lugar muy bello, tranquilo y muy poco concurrido lo que lo hace un lugar ideal.",
                "34°"," 13 km/h",
                "2%","49%",
                "5","10 KM",
                "http://www.nicaraguayestravel.com/wp-content/uploads/2015/06/Playa-Amarillo-Nicaragua.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Gigante",
                "Tola, Rivas", "11.388652, -86.032629",
                "Nicaragua",
                "Se ubica en el municipio de Tola, sobre la espectacular cadena de costas hermosas, esta playa de arenas doradas y hermosas rocas muestra un espectáculo a los turistas que llegan a conocerla.",
                "35°"," 10 km/h",
                "2%","49%",
                "6","10 KM",
                "https://media-cdn.tripadvisor.com/media/photo-s/01/5f/b1/f7/giant-s-foot-sunset.jpg");


        beachList.add(beach);
        beach = new Beach("Playa La Redonda ",
                "Tola, Rivas", "11.382212, -86.030027",
                "Nicaragua",
                "Una pequeña playa en forma de medialuna, al sur de la Playa El Coco.",
                "36°"," 10 km/h",
                "3%","48%",
                "7","10 KM",
                "https://media-cdn.tripadvisor.com/media/photo-s/01/db/7e/fd/view-from-our-deck.jpg");


        beachList.add(beach);
        beach = new Beach("Playa Ocotal",
                "San Juan del Sur, Rivas", "11.306980, -85.923009",
                "Nicaragua",
                "Pequeña playa al norte de la playa Majagual, con acceso por tierra restringido por la ubicación de un resort ecológico, pero tiene acceso por vía marítima.",
                "34°"," 20 km/h",
                "24%","57%",
                "6","10 KM",
                "http://photos.luxurylink.us/images/sho_54c14af2/2222_18-2048/Beach.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Mathilda",
                "San Juan del Sur, Rivas", "11.302989, -85.919086",
                "Nicaragua",
                "Es uno de esos sitios en los que, cuando lo conoces, tienes la sensación de que en este mundo todavía quedan reductos sin arrasar turísticamente. Para llegar allí el camino llega hasta cierto punto, después del cual hay que caminar por la playa durante 15 minutos hasta que alcanzas esta playa vacía, con dos alojamientos económicos.",
                "34°"," 10 km/h",
                "1%","45%",
                "6","10 KM",
                "http://endimages.s3.amazonaws.com/legacy/1419724815_Playa%20Mathilda.jpg");


        beachList.add(beach);
        beach = new Beach("Playa Nacascolo",
                "San Juan del Sur, Rivas", "11.268310, -85.886037",
                "Nicaragua",
                "Playa de Nacascolo es la playa más cercana a San Juan del Sur, existe una comunidad de extranjeros viviendo en la zona, en la que se han desarrollado residenciales de gran valor, a su vez han invertido en varios hoteles muy finos en donde albergan a turistas por largos periodos.",
                "34°"," 10 km/h",
                "1%","45%",
                "6","10 KM",
                "http://4.bp.blogspot.com/-lzLJoUEVt5o/UzradYg26gI/AAAAAAAABLk/Ju2uRJcWhu4/s1600/cove.jpg");

        beachList.add(beach);
        beach = new Beach("Playa Escameca",
                "San Juan del Sur, Rivas", "11.168991, -85.808558",
                "Nicaragua",
                "Playa, sol y naturaleza es lo que se puede disfrutar  en esta costa, ubicada a poca  distancia del refugio de vida silvestre La Flor, sitio de anidamiento de  las tortugas paslama. ",
                "34°"," 10 km/h",
                "1%","45%",
                "6","10 KM",
                "https://s-media-cache-ak0.pinimg.com/736x/d8/ab/43/d8ab432e43301d79b6e315088f597eab.jpg");

        beachList.add(beach);
        beach = new Beach("Playa El Coco",
                "San Juan del Sur, Rivas", "11.156892, -85.802134",
                "Nicaragua",
                "Esta enorme y maravillosa playa, como todas las de la zona, es de una arena muy fina y sus aguas son muy tranquilas y apacibles. El lugar resulta absolutamente relajante y seguro, lo que lo hacen muy apropiado para disfrutar de unas placenteras vacaciones con la familia o unos inolvidables y románticos vacaciones en pareja.",
                "34°"," 10 km/h",
                "1%","45%",
                "6","10 KM",
                "https://media-cdn.tripadvisor.com/media/photo-s/01/8b/b2/44/portada.jpg");

        beachList.add(beach);
        beach = new Beach("Playa El Ostional",
                "San Juan del Sur, Rivas", "11.106222, -85.760619",
                "Nicaragua",
                "Esta playa, amplia e imponente, es una de las menos visitadas de la zona, quizá por su lejanía. Esta condición la hace una playa tranquila y solitaria, pero desde hace unos años es también sitio de proyectos turísticos emergentes administrados por la comunidad local.",
                "34°"," 10 km/h",
                "1%","45%",
                "6","10 KM",
                "https://media-cdn.tripadvisor.com/media/photo-s/07/6d/1e/68/el-ostional.jpg");

        beachList.add(beach);




        mAdapter.notifyDataSetChanged();
    }

}
