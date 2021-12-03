package com.callor.exinsert.ui.dashboard

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.callor.exinsert.MainActivity
import com.callor.exinsert.R
import com.callor.exinsert.databinding.FragmentDashboardBinding
import com.callor.exinsert.model.Board

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    lateinit var mainActivity: MainActivity

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // context로 설정해서 Toast 띄우기
    // 프로젝트 자체에선 필요x 코드
    override fun onAttach(context: Context) {
        super.onAttach(context)

        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)

        var send:Button = binding.btnSend
        send.setOnClickListener(View.OnClickListener {

           var author:EditText = binding.author
           var title:EditText = binding.title
           var date:EditText = binding.date
           var content:EditText = binding.content

            Log.d("title",  )

        })



        return binding.root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}