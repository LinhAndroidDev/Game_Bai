package com.example.mykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userlist: ArrayList<User> = ArrayList()

        userlist.add(User("1","Nguyễn Hữu Linh","nguyenlinh@gmail.com","Khoa Điện tử"))
        userlist.add(User("2","Nguyễn Thế Dương","duong.nt13@gmail.com","Đại học Dược"))
        userlist.add(User("3","Trần Đức Ngọc","ngoctd@gmail.com","Kinh tế quốc dân"))
        userlist.add(User("4","Dương Văn Đại","dai.dv25@gmail.com","Kinh tế quốc dân"))
        userlist.add(User("5","Phan Văn Hùng","hung.pv192988@sis.hust.edu.vn","Bách Khoa"))
        userlist.add(User("6","Đặng Anh Tài","tai.da@gmail.com","Khoa Điện tử"))
        userlist.add(User("7","Vũ Đình Khải","khai.vd192654@sis.hust.edu.vn","Bách Khoa"))
        userlist.add(User("8","Vũ Thị Thanh","thanh.vt@gmail.com","Viện Vật Lí Kĩ Thuật"))
        userlist.add(User("9","Phạm Hoàng Huynh","huynh.ph@gmail.com","Đại Học Quốc Gia"))
        userlist.add(User("10","Nguyễn Đức Thắng","thang.nd@sis.hust.edu.vn","Khoa Điện tử"))

        ListView.adapter = UserAdapter(this@MainActivity,userlist)

        next.setOnClickListener {
            var intent: Intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}