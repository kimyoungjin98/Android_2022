package com.callor.bottom

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.callor.bottom.databinding.ActivityMainBinding
import com.callor.bottom.ui.login.LoginFragment

class MainActivity : AppCompatActivity(), LoginFragment.BottomNav {

    // binding 방식으로 activity에 접근하기 위한 준비
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // activity.xml을 화면에 그리는 과정
        // activity.xml 파일을 확장하여 binding 객체로 변환하기
        binding = ActivityMainBinding.inflate(layoutInflater)

        // 확장된 binding을 처음 화면에 그리기
        setContentView(binding.root)

        // Bottom nav를 설정하는 부분
        // val navView:BottomNavgationView = binding.navView

        // Kotlin에서 변수를 선언할때 type이 명확하고 null 이 절대 아닌 경우는
        // 변수의 type을 생략할 수 있다
        val navView:BottomNavigationView = binding.navView

        // fragment를 NavControl 방식으로 제어하기 위하여 선언하기
        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        // ==============
        // BotoomNav 를 선택했을 때
        // 화면에 해당하는 fragment를 띄우고
        // 띄워진 fragment가 어떤 것인지 title bar 에 제목을 표시하기 위한 절차
        // bottom_nav_menu.xml 에 선언된 메뉴 item들을 Set type의 데이터로 만들기
        // Set type의 데이터 : 중복되지 않은 단순한 collection type의 데이터
        val menuSets = setOf(
            R.id.navigation_home,
            R.id.navigation_dashboard,
            R.id.navigation_notifications
        )

        // AppBar 와 bottom_nav_menu.xml 과 연동하기
        val appBarConfiguration = AppBarConfiguration(menuSets)

        // AppBar 와 BottomNav 를 연동하기위한 준비
        setupActionBarWithNavController(navController, appBarConfiguration)

        // 선언된 NavController 를 navView 에 부착하기
        navView.setupWithNavController(navController)

        // 사용자 정보 임시 생성
        // login 칼럼을 false로
        val login = mapOf(
            "username" to "callor",
            "password" to "12345",
            "nickname" to "홍길동",
            "isLogin" to true,
        )

        if(login["isLogin"] == false){
            findNavController(R.id.nav_host_fragment_container)
                .navigate(R.id.action_global_navigation_login)
        }

    }

    override fun setBottomNav(status: Boolean) {

        // status 가 true 이면 Bottom Nav 를 보이고
        // false 이면 감춰라
        binding.navView.visibility = if(status) View.VISIBLE else View.GONE

    }
}