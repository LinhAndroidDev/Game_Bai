package com.example.mykotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dong_user.view.*

class UserAdapter (var context:Context,var userlist: ArrayList<User>) : BaseAdapter(){
    class ViewHolder(row: View){
        var user_id:TextView
        var fullname:TextView
        var email:TextView
        var mobile:TextView

        init {
            user_id = row.findViewById(R.id.user_id) as TextView
            fullname = row.findViewById(R.id.fullname) as TextView
            email = row.findViewById(R.id.email) as TextView
            mobile = row.findViewById(R.id.mobile) as TextView
        }
    }

    override fun getCount(): Int {
        return userlist.size
    }

    override fun getItem(position: Int): Any {
        return userlist.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if(convertView == null){
            var layoutInflater:LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.dong_user,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        var user: User = userlist.get(position)
        viewHolder.user_id.text = user.user_id
        viewHolder.fullname.text = user.fullname
        viewHolder.email.text = user.email
        viewHolder.mobile.text = user.mobile

        var animation:Animation = AnimationUtils.loadAnimation(context,R.anim.anim_scale)
        if (view != null) {
            view.startAnimation(animation)
        }

        return  view as View
    }

}