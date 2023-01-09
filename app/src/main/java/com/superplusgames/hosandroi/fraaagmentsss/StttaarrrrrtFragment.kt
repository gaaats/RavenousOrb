package com.superplusgames.hosandroi.fraaagmentsss

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superplusgames.hosandroi.R
import com.superplusgames.hosandroi.databinding.FragmentStttaarrrrrtBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StttaarrrrrtFragment : Fragment() {

    val intList = listOf(0, 2, 3)
    val variant2ggt = listOf(2, 3, 5)
    val variant3gtgt = listOf(1, 4, 5)
    val gtgthyhyyhhy = listOf(0, 4, 5)
    val yhhyyjujuujujju = listOf(0, 3, 5)

    val gthyyhyhyhyhyhy = listOf(
        intList,
        variant2ggt,
        variant3gtgt,
        gtgthyhyyhhy,
        yhhyyjujuujujju,
    ).shuffled()

    var hyhyhy = true
    var bgbggbbgbgbg = true

    val hyjujujujujjmjmj by lazy {
        listOf(
            stttaarrrrrtBinding.imgElem1Backgtgtgtgt,
            stttaarrrrrtBinding.imgElem2Backgtgtgtgt,
            stttaarrrrrtBinding.imgElem3Backgtgtgt,
            stttaarrrrrtBinding.imgElem4Backgtgtgtgtgtgthy,
            stttaarrrrrtBinding.imgElem5Backgtgtgtgtgt,
            stttaarrrrrtBinding.imgElem6Backgtgtgtgt
        )
    }

    private fun cleeeear (){
        hyjujujujujjmjmj.forEach {
            it.contentDescription = ""
        }
    }

    private fun createAnimatorSetFront(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.hujujujujuj
        ) as AnimatorSet
    }

    private fun setBack(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.gthyhyhyhy
        ) as AnimatorSet
    }

    private val gbgbgbbggbg by lazy {
        createAnimatorSetFront()
    }
    private val hyhjujuujuj by lazy {
        createAnimatorSetFront()
    }
    private val vfvgbgbbgbg by lazy {
        createAnimatorSetFront()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            stttaarrrrrtBinding.root.background.alpha = 235
            val vfvvfvfvfvfvf = gthyyhyhyhyhyhy.random()

            for (element in 0..5) {
                if (vfvvfvfvfvfvf.contains(element)) {
                    hyjujujujujjmjmj[element].contentDescription = "ok"
                    val imaaaage =
                        ContextCompat.getDrawable(requireActivity(), R.drawable.dog1gtgtgt)
                    hyjujujujujjmjmj[element].setImageDrawable(imaaaage)
                } else {
                    hyjujujujujjmjmj[element].contentDescription = "false"
                    hyjujujujujjmjmj[element].setImageDrawable(nhjhjjj.random())
                }
            }

            if (bgbggbbgbgbg) {
                lifecycleScope.launch {
                    gt4tgt4484gt844gt()
                    gjtigtjtjtg()
                    kotgktkgtktgktg5tg95()
                    gkotgkgtkgktktg8()

                    delay(2000)

                    bgbgbgnhh()
                    njukukkjjj()
                    xsdvghgh()
                    vfrrthy()
                    bghjj()
                    bggbbgbgbg5gb5bg5bggb6gb6()
                }


            }

            val bggtgtgtgtgt = requireContext().applicationContext.resources.displayMetrics.density
            stttaarrrrrtBinding.imgElem1gtgtgtgtgt.cameraDistance = 8000 * bggtgtgtgtgt
            stttaarrrrrtBinding.imgElem1Backgtgtgtgt.cameraDistance = 8000 * bggtgtgtgtgt


            stttaarrrrrtBinding.btnImgExitInfoggtgtgtgt.setOnClickListener {
                requireActivity().onBackPressed()
            }

            stttaarrrrrtBinding.imgElem1gtgtgtgtgt.setOnClickListener {
                stttaarrrrrtBinding.imgElem1gtgtgtgtgt.isEnabled = false
                gt4tgt4484gt844gt()
                lifecycleScope.launch {
                    if (stttaarrrrrtBinding.imgElem1Backgtgtgtgt.contentDescription == "ok") {
                        ghuthughtuhtht()
                        if (bgbhhhh()) jujujujuj()
                    } else {
                        delay(2000)
                        stttaarrrrrtBinding.imgElem1gtgtgtgtgt.isEnabled = true
                        bgbgbgnhh()
                    }
                }
            }
            stttaarrrrrtBinding.imgElem2gtgtgtgt.setOnClickListener {
                stttaarrrrrtBinding.imgElem2gtgtgtgt.isEnabled = false
                r5frrf5fr()
                lifecycleScope.launch {
                    if (stttaarrrrrtBinding.imgElem2Backgtgtgtgt.contentDescription == "ok") {
                        stttaarrrrrtBinding.imgElem2gtgtgtgt.isEnabled = false
                        delay(900)
                        tgitggtdgdyrfgrf()
                        njukukkjjj()
                        stttaarrrrrtBinding.imgElem2Backgtgtgtgt.contentDescription = "done"
                        if (bgbhhhh()) jujujujuj()

                    } else {
                        delay(2000)
                        stttaarrrrrtBinding.imgElem2gtgtgtgt.isEnabled = true
                        njukukkjjj()
                    }
                }

            }

            stttaarrrrrtBinding.imgElem3Backgtgtgt.setOnClickListener {
                stttaarrrrrtBinding.imgElem3gtgtgtgttgtgtgtgt.isEnabled = false
                rf5r5f5r5fr5()
                lifecycleScope.launch {
                    if (stttaarrrrrtBinding.imgElem3Backgtgtgt.contentDescription == "ok") {
                        stttaarrrrrtBinding.imgElem3gtgtgtgttgtgtgtgt.isEnabled = false
                        delay(900)
                        stttaarrrrrtBinding.imgElem3Backgtgtgt.visibility = View.INVISIBLE
                        xsdvghgh()
                        tkgotokgtokgtoggtk()

                        if (bgbhhhh()) jujujujuj()
                    } else {
                        delay(2000)
                        stttaarrrrrtBinding.imgElem3gtgtgtgttgtgtgtgt.isEnabled = true

                        xsdvghgh()
                    }
                }

            }

            stttaarrrrrtBinding.imgElem4gtgtgtgtgt.setOnClickListener {
                stttaarrrrrtBinding.imgElem4gtgtgtgtgt.isEnabled = false
                fr5rf5rf5rf8rf8rf()
                lifecycleScope.launch {
                    if (stttaarrrrrtBinding.imgElem4Backgtgtgtgtgtgthy.contentDescription == "ok") {
                        gjtigtijgjtjgijtjgt()
                        if (bgbhhhh()) jujujujuj()
                    } else {
                        delay(2000)
                        stttaarrrrrtBinding.imgElem4gtgtgtgtgt.isEnabled = true
                        vfrrthy()
                    }

                }

            }

            stttaarrrrrtBinding.imgElem5gtgttggt.setOnClickListener {
                stttaarrrrrtBinding.imgElem4gtgtgtgtgt.isEnabled = false
                kotgktkgtktgktg5tg95()
                lifecycleScope.launch {
                    if (stttaarrrrrtBinding.imgElem5Backgtgtgtgtgt.contentDescription == "ok") {
                        stttaarrrrrtBinding.imgElem5gtgttggt.isEnabled = false
                        gtjigjtgjgtjgt()

                        if (bgbhhhh()) jujujujuj()
                    } else {
                        delay(2000)
                        stttaarrrrrtBinding.imgElem4gtgtgtgtgt.isEnabled = true
                        bghjj()
                    }
                }

            }

            stttaarrrrrtBinding.imgElem6ggtgtgthyjuuj.setOnClickListener {
                stttaarrrrrtBinding.imgElem6ggtgtgthyjuuj.isEnabled = false
                gkotgkgtkgktktg8()
                lifecycleScope.launch {
                    if (stttaarrrrrtBinding.imgElem6Backgtgtgtgt.contentDescription == "ok") {
                        gtugtutguhgtht()

                        if (bgbhhhh()) jujujujuj()
                    } else {
                        delay(2000)
                        stttaarrrrrtBinding.imgElem6ggtgtgthyjuuj.isEnabled = true
                        bggbbgbgbg5gb5bg5bggb6gb6()
                    }
                }
            }


        } catch (e: Exception) {
            tgtughgtuhgthugt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private suspend fun gtugtutguhgtht() {
        stttaarrrrrtBinding.imgElem6ggtgtgthyjuuj.isEnabled = false
        delay(900)
        stttaarrrrrtBinding.imgElem6ggtgtgthyjuuj.visibility = View.INVISIBLE
        bggbbgbgbg5gb5bg5bggb6gb6()
        stttaarrrrrtBinding.imgElem6Backgtgtgtgt.contentDescription = "done"
    }

    private suspend fun gtjigjtgjgtjgt() {
        delay(900)
        stttaarrrrrtBinding.imgElem5gtgttggt.visibility = View.INVISIBLE
        bghjj()
        stttaarrrrrtBinding.imgElem5Backgtgtgtgtgt.contentDescription = "done"
    }

    private suspend fun gjtigtijgjtjgijtjgt() {
        stttaarrrrrtBinding.imgElem4gtgtgtgtgt.isEnabled = false
        delay(900)
        stttaarrrrrtBinding.imgElem4gtgtgtgtgt.visibility = View.INVISIBLE
        vfrrthy()
        stttaarrrrrtBinding.imgElem4Backgtgtgtgtgtgthy.contentDescription = "done"
    }

    private fun gjtigtjtjtg() {
        r5frrf5fr()
        rf5r5f5r5fr5()
        fr5rf5rf5rf8rf8rf()
    }

    private suspend fun ghuthughtuhtht() {
        stttaarrrrrtBinding.imgElem1gtgtgtgtgt.isEnabled = false
        delay(900)
        stttaarrrrrtBinding.imgElem1gtgtgtgtgt.visibility = View.INVISIBLE
        bgbgbgnhh()
        stttaarrrrrtBinding.imgElem1Backgtgtgtgt.contentDescription = "done"
    }

    private fun tgitggtdgdyrfgrf() {
        stttaarrrrrtBinding.imgElem2gtgtgtgt.visibility = View.INVISIBLE
    }

    private fun tkgotokgtokgtoggtk() {
        stttaarrrrrtBinding.imgElem3Backgtgtgt.contentDescription = "done"
    }

    private fun iniOnClickListener(view: View, funIsFront: Unit, funForBack: Unit) {
        val byhhgfdcvv = view as ImageView
        funIsFront
        lifecycleScope.launch {
            if (byhhgfdcvv.contentDescription == "ok") {
                view.isEnabled = false
                delay(1000)
                view.visibility = View.INVISIBLE
                funForBack
            } else {
                funForBack
            }
        }
        if (bgbhhhh()) {
            jujujujuj()

        }
    }

    private val jujikikikikik by lazy {
        createAnimatorSetFront()
    }
    private val bghnhnhhnhn by lazy {
        createAnimatorSetFront()
    }
    private val tgtghyhyhyhy by lazy {
        createAnimatorSetFront()
    }

    private val bbbbvvv6 by lazy {
        setBack()
    }

    private val cdcdvvfvfvfvf2 by lazy {
        setBack()
    }


    private fun jujujujuj() {
        lifecycleScope.launchWhenCreated {
            delay(1500)
            findNavController().navigate(R.id.action_stttaarrrrrtFragment_to_reeeeeeelllloaoaoaFragment)
        }

    }

    private fun tgtgtgtgt(elemFront: ImageView) = elemFront.visibility == View.INVISIBLE

    private fun bgbhhhh(): Boolean {
        var counttteeer = 0
        for (i in hyjujujujujjmjmj) {
            if (i.contentDescription == "done") {
                counttteeer++
            }
        }
        return counttteeer == 3

    }


    private val bbgnhnhnhnhhn8 by lazy {
        setBack()
    }
    private val tgthyhyyhyhyyhy5 by lazy {
        setBack()
    }
    private val sdedrfrfrfrrf by lazy {
        setBack()
    }
    private val vfbgbhnhyhyhy89 by lazy {
        setBack()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun bgbgbgnhh() {
        gjtigjtgjjgtjitggtg5tgt555555(
            gbgbgbbggbg,
            bbbbvvv6,
            stttaarrrrrtBinding.imgElem1gtgtgtgtgt,
            stttaarrrrrtBinding.imgElem1Backgtgtgtgt
        )
    }

    private fun njukukkjjj() {
        gjtigjtgjjgtjitggtg5tgt555555(
            hyhjujuujuj,
            cdcdvvfvfvfvf2,
            stttaarrrrrtBinding.imgElem2gtgtgtgt,
            stttaarrrrrtBinding.imgElem2Backgtgtgtgt
        )
    }

    private fun vfrrthy() {
        gjtigjtgjjgtjitggtg5tgt555555(
            jujikikikikik,
            tgthyhyyhyhyyhy5,
            stttaarrrrrtBinding.imgElem4gtgtgtgtgt,
            stttaarrrrrtBinding.imgElem4Backgtgtgtgtgtgthy
        )
    }

    private fun bghjj() {
        gjtigjtgjjgtjitggtg5tgt555555(
            bghnhnhhnhn,
            sdedrfrfrfrrf,
            stttaarrrrrtBinding.imgElem5gtgttggt,
            stttaarrrrrtBinding.imgElem5Backgtgtgtgtgt
        )
    }

    private fun xsdvghgh() {
        gjtigjtgjjgtjitggtg5tgt555555(
            vfvgbgbbgbg,
            bbgnhnhnhnhhn8,
            stttaarrrrrtBinding.imgElem3gtgtgtgttgtgtgtgt,
            stttaarrrrrtBinding.imgElem3Backgtgtgt
        )
    }


    private fun bggbbgbgbg5gb5bg5bggb6gb6() {
        gjtigjtgjjgtjitggtg5tgt555555(
            tgtghyhyhyhy,
            vfbgbhnhyhyhy89,
            stttaarrrrrtBinding.imgElem6ggtgtgthyjuuj,
            stttaarrrrrtBinding.imgElem6Backgtgtgtgt
        )
    }


    private fun gt4tgt4484gt844gt() {
        bvbvbbvvbvbvb(
            gbgbgbbggbg,
            bbbbvvv6,
            stttaarrrrrtBinding.imgElem1gtgtgtgtgt,
            stttaarrrrrtBinding.imgElem1Backgtgtgtgt
        )
    }

    private fun r5frrf5fr() {
        bvbvbbvvbvbvb(
            hyhjujuujuj,
            cdcdvvfvfvfvf2,
            stttaarrrrrtBinding.imgElem2gtgtgtgt,
            stttaarrrrrtBinding.imgElem2Backgtgtgtgt
        )
    }

    private fun rf5r5f5r5fr5() {
        bvbvbbvvbvbvb(
            vfvgbgbbgbg,
            bbgnhnhnhnhhn8,
            stttaarrrrrtBinding.imgElem3gtgtgtgttgtgtgtgt,
            stttaarrrrrtBinding.imgElem3Backgtgtgt
        )
    }

    private fun fr5rf5rf5rf8rf8rf() {
        bvbvbbvvbvbvb(
            jujikikikikik,
            tgthyhyyhyhyyhy5,
            stttaarrrrrtBinding.imgElem4gtgtgtgtgt,
            stttaarrrrrtBinding.imgElem4Backgtgtgtgtgtgthy
        )
    }

    private fun kotgktkgtktgktg5tg95() {
        bvbvbbvvbvbvb(
            bghnhnhhnhn,
            sdedrfrfrfrrf,
            stttaarrrrrtBinding.imgElem5gtgttggt,
            stttaarrrrrtBinding.imgElem5Backgtgtgtgtgt
        )
    }

    private fun gkotgkgtkgktktg8() {
        bvbvbbvvbvbvb(
            tgtghyhyhyhy,
            vfbgbhnhyhyhy89,
            stttaarrrrrtBinding.imgElem6ggtgtgthyjuuj,
            stttaarrrrrtBinding.imgElem6Backgtgtgtgt
        )
    }

    private fun gjtigjtgjjgtjitggtg5tgt555555(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemBack)
        backAnim.setTarget(elemFront)
        frontAnim.start()
        backAnim.start()
    }


    private fun bvbvbbvvbvbvb(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemFront)
        backAnim.setTarget(elemBack)
        frontAnim.start()
        backAnim.start()
    }

    override fun onDestroy() {
        cleeeear()
        fragmentStttaarrrrrtBinding = null
        super.onDestroy()
    }

    private var fragmentStttaarrrrrtBinding: FragmentStttaarrrrrtBinding? = null
    private val stttaarrrrrtBinding
        get() = fragmentStttaarrrrrtBinding
            ?: throw RuntimeException("FragmentStttaarrrrrtBinding = null")

    private fun tgtughgtuhgthugt() {
        Snackbar.make(
            stttaarrrrrtBinding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    val nhjhjjj by lazy {
        listOf(
            ContextCompat.getDrawable(requireActivity(), R.drawable.fffffrrfrfrf),
            ContextCompat.getDrawable(requireActivity(), R.drawable.d1gtgtgt),
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStttaarrrrrtBinding =
            FragmentStttaarrrrrtBinding.inflate(inflater, container, false)
        return stttaarrrrrtBinding.root
    }
}