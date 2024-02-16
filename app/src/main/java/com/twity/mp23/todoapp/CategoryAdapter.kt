package com.twity.mp23.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.twity.mp23.R


// la clase CategoryAdapter nos permite mostrar la lista
class CategoryAdapter(
    private val categories: List<TaskCategory>,
    private val onItemSelected: (Int) -> Unit
) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position],onItemSelected)
        //onTemSelected esta sin parentesis porque se lo estoy mandando.
        // si estuviera con parentesis como una funcion lo estaria ejecutando
    }

    /* getItemCount es para idicar cuantes lineas se desea mostrar,
        si no existe la cantidad de informacion para esa cantidad de linea se rompe.
    ******************************************************************************************
    override fun getItemCount(): Int {
        return categories.size
    }
    se puede escribir la funciona asi tambien .
                                              V
*/
    override fun getItemCount() = categories.size

}
