package com.example.tugasmodul8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class SecondFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null
    private var txtName2: TextView? = null
    private var txtName3: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.nama)
        communicationViewModel!!.name.observe(requireActivity(), Observer { s -> txtName!!.text = s })

        txtName2 = view.findViewById(R.id.gender)
        communicationViewModel!!.gender.observe(requireActivity(), Observer { s2 -> txtName2!!.text = s2 })

        txtName3 = view.findViewById(R.id.pesan)
        communicationViewModel!!.pesan.observe(requireActivity(), Observer { s3 -> txtName3!!.text = s3 })
    }

    companion object {
        fun newInstance(): SecondFragment{
            return SecondFragment()
        }
    }

}