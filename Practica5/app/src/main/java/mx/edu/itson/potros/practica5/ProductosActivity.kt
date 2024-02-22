package mx.edu.itson.potros.practica5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listview: ListView = findViewById(R.id.litview) as ListView


        var adaptador : AdaptadorProductos = AdaptadorProductos(this, menu)
        listview.adapter = adaptador
    }

    fun agregarProductos(option: String?){
        var image : ImageView = findViewById(R.id.imageView)
        when(option){
            "Antojitos"->{
                menu.add(Product("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", 5.69))
                menu.add(Product("Huaraches", R.drawable.huaraches, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.", 10.99))
                menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
                menu.add(Product("Sincronizadas", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", 7.99))
                menu.add(Product("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.", 3.79))
                menu.add(Product("Tostadas", R.drawable.tostadas, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.", 4.59))
                image.setImageResource(R.drawable.antojitos)
            }
            "Especialidades"->{
                menu.add(Product("Mojarra Frita - Fried Fish", R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Ceviche", R.drawable.ceviche, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
                menu.add(Product("Botana de camarones al mojo de ajo", R.drawable.botanacamarones, "Servido totopos, cebolla frita, arroz, lechuga y pico de gallo - Served with chips, grill onions, rice, lettuce and pico de gallo.", 19.99))
                image.setImageResource(R.drawable.especialidades)
            }
            "Combinaciones"->{
                menu.add(Product("Traditional taco combo", R.drawable.combinationtaco, "Tortilla de Maíz y tu carne favorita. Servido con arroz y frijoles - Corn taco, your choice of meat, served with rice and beans.", 6.99))
                menu.add(Product("Mexican burritos", R.drawable.burritos, "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, guacamole, sour cream, frijoles y acompañado de arroz -Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.", 12.99))
                menu.add(Product("Los portales burritos", R.drawable.burritosportales, "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole.", 13.59))
                menu.add(Product("Cinco", R.drawable.cinco, "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.", 9.99))
                menu.add(Product("Dos amigos", R.drawable.dosamigos, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans", 9.99))
                menu.add(Product("Burrito pepe", R.drawable.burritopepe, "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.", 9.99))
                menu.add(Product("Fajita burrito", R.drawable.cominationburros, "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole - Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce guacamole and sour cream.", 13.59))
                menu.add(Product("Fajita quesadilla", R.drawable.fajitaquesadilla, "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada - 10 inches quesadilla filled with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.", 13.99))
                image.setImageResource(R.drawable.combinations)
            }
            "Tortas"->{
                menu.add(Product("Torta regular", R.drawable.torta, "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat.", 12.99))
                menu.add(Product("Torta - milanesa de res o pollo", R.drawable.tortamilanesa, "Breaded Steak or Chicken", 13.99))
                menu.add(Product("Torta cubana", R.drawable.tortacubana, "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese.", 13.99))
                menu.add(Product("Torta mixta", R.drawable.tortamixta, "Chorizo, asada y pastor./ Mexican sausage, steak and marinated pork.", 13.99))
                menu.add(Product("Torta pequeña mexicana", R.drawable.smallmexican, "Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream.", 7.39))
                image.setImageResource(R.drawable.tortas)
            }
            "Sopas"->{
                menu.add(Product("Pozole", R.drawable.pozole, "Platillo mexicano típico con carne de puerco y chile colorado. Typical Mexican dish with pork and red chili.", 5.99))
                menu.add(Product("Menudo", R.drawable.menudo, "Platillo típico con panza y pata de res. Typical dish with beef belly and leg.", 5.99))
                menu.add(Product("Caldo de res", R.drawable.caldores, "Caldo con carne de res. Broth with beef", 5.99))
                menu.add(Product("Caldo de camaron", R.drawable.caldocamaron, "Delicioso caldo de camaron fresco. Delicious fresh shrimp broth.", 13.99))
                menu.add(Product("Sopa de mariscos", R.drawable.sopamariscos, "Sopa de mariscos con camaron, pescado, jaiba, calamar y pulpo. Seafood soup with shrimp, fish, crab, squid and octopus.", 19.99))
                image.setImageResource(R.drawable.sopas)
            }
            "Drinks"->{
                menu.add(Product("Soft Drinks 20oz - Sodas 20oz", R.drawable.sodas, "Refrescos y bebidas ligeras de 20 onzas. Sodas and Soft Drinks 20oz.", 2.99))
                menu.add(Product("Jarritos", R.drawable.jarritos, "Refresco de vidrio de varios sabores. - Glass soda of various flavors.", 2.75))
                menu.add(Product("Caguama", R.drawable.caguama, "Caguamas bien heladas para combatir el calor. Very cold caguamas to defeat the hot.", 2.99))
                image.setImageResource(R.drawable.drinks)
            }
        }

    }

    private class AdaptadorProductos: BaseAdapter {
        var producto=ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, producto: ArrayList<Product>){
            this.producto=producto
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return producto.size
        }

        override fun getItem(position: Int): Any {
            return producto[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var prod=producto[position]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.producto_view, null)

            var imagen=vista.findViewById(R.id.producto_img) as ImageView
            var nombre=vista.findViewById(R.id.producto_nombre) as TextView
            var desc=vista.findViewById(R.id.producto_desc) as TextView
            var precio=vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")
            return vista
        }
    }
}