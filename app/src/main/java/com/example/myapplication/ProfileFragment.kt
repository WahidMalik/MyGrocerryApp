package com.example.myapplication

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class ProfileFragment : Fragment() {

    lateinit var profileToolbar : Toolbar
    lateinit var editProfileButton : ImageButton
    lateinit var addressProfileButton : ImageButton
    lateinit var notificationsProfileButton : ImageButton
    lateinit var walleteButton : ImageButton
    lateinit var policyButton: ImageButton
    lateinit var helpButton: ImageButton
    lateinit var logoutButton: TextView
    lateinit var cancelButton: Button
    lateinit var logoutButtonInDialog: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profileToolbar = view.findViewById(R.id.profileToolbar)
        editProfileButton = view.findViewById(R.id.editProfileButton)
        addressProfileButton = view.findViewById(R.id.addressProfileButton)
        notificationsProfileButton = view.findViewById(R.id.notificaionsImageButton)
        walleteButton = view.findViewById(R.id.walletProfileButton)
        policyButton = view.findViewById(R.id.policyProfileButton)
        helpButton = view.findViewById(R.id.helpProfileButton)
        logoutButton = view.findViewById(R.id.logoutButton)
        profileToolbar.title = "Profile"
        profileToolbar.setTitleTextColor(R.color.white)

        editProfileButton.setOnClickListener {
            val intent = Intent(requireContext(), EditProfile::class.java)
            startActivity(intent)
        }

        addressProfileButton.setOnClickListener {
            val intent = Intent(requireContext(), Address::class.java)
            startActivity(intent)
        }

        notificationsProfileButton.setOnClickListener {
            val intent = Intent(requireContext(), Notificaions::class.java)
            startActivity(intent)
        }
        walleteButton.setOnClickListener {
            val intent = Intent(requireContext(), Wallet::class.java)
            startActivity(intent)
        }
        policyButton.setOnClickListener {
            val intent = Intent(requireContext(), Policy::class.java)
            startActivity(intent)
        }
        helpButton.setOnClickListener {
            val intent = Intent(requireContext(), HelpUs::class.java)
            startActivity(intent)
        }
        logoutButton.setOnClickListener {
           val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.logoutdialog)
            dialog.setCancelable(false)
            dialog.show()

            val cancelButton = dialog.findViewById<Button>(R.id.cancelButton)
            val logoutButtonInDialog = dialog.findViewById<Button>(R.id.logoutButton)

            cancelButton.setOnClickListener {
                dialog.dismiss()
            }
            logoutButtonInDialog.setOnClickListener {
                Toast.makeText(requireContext(), "Logged Out", Toast.LENGTH_SHORT).show()
            }
        }







    }
}