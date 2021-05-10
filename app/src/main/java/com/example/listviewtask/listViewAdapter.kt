package com.example.listviewtask

import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class listViewAdapter(context:Context, facts:List<dbModel> ) : ArrayAdapter<dbModel>(context,0,facts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val fact = getItem(position)
        if (view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.display_item,parent,false)
        }
        var logo = view?.findViewById<ImageView>(R.id.imageView)
        var name = view?.findViewById<TextView>(R.id.tv_name)

        fact?.logo?.let {
            logo?.setImageResource(fact.logo)
        }
        name?.text = fact?.name

        view?.setOnClickListener{

            val intent = Intent(parent.context, detailActivity::class.java)
            intent.putExtra(LOGO_EXTRA,fact?.logo)
            intent.putExtra(NAME_EXTRA,fact?.name)
            intent.putExtra(DESCRIPTION_EXTRA,fact?.description)
            parent.context.startActivity(intent)
        }


        return view!!
    }

    companion object{
        const val LOGO_EXTRA = "logo_extra"
        const val NAME_EXTRA = "name_extra"
        const val DESCRIPTION_EXTRA = "description_extra"
    }

}

