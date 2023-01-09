package com.superplusgames.hosandroi.fraaagmentsss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.superplusgames.hosandroi.R
import com.superplusgames.hosandroi.databinding.FragmentReeeeeeelllloaoaoaBinding
import kotlinx.coroutines.delay
import kotlin.random.Random


class ReeeeeeelllloaoaoaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentReeeeeeelllloaoaoaBinding =
            FragmentReeeeeeelllloaoaoaBinding.inflate(inflater, container, false)
        return reeeeeeelllloaoaoaBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val text = "Earned ${Random.nextInt(from = 100, until = 525)}"
            gtkogkokhkyhykkyh(text)

            gjtjgjtgjjgtjgt()


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtkogkokhkyhykkyh(text: String) {
        ogtjgtjgtiitjjgti(text)
    }

    private fun ogtjgtjgtiitjjgti(text: String) {
        Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
    }

    private fun gjtjgjtgjjgtjgt() {
        lifecycleScope.launchWhenCreated {
            delay(2500)
            findNavController().navigate(R.id.action_reeeeeeelllloaoaoaFragment_to_stttaarrrrrtFragment)
        }
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentReeeeeeelllloaoaoaBinding = null
        super.onDestroy()
    }

    private var fragmentReeeeeeelllloaoaoaBinding: FragmentReeeeeeelllloaoaoaBinding? = null
    private val reeeeeeelllloaoaoaBinding
        get() = fragmentReeeeeeelllloaoaoaBinding
            ?: throw RuntimeException("FragmentReeeeeeelllloaoaoaBinding = null")

    private fun vfvvf() {
        gtkgtkgtkkgt()
        requireActivity().onBackPressed()
    }

    private fun gtkgtkgtkkgt() {
        tgktktgkgtkkgt()
    }

    private fun tgktktgkgtkkgt() {
        Toast.makeText(
            requireContext(),
            "Some error...",
            Toast.LENGTH_LONG
        ).show()
    }

}