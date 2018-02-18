package com.skrbectechnology.stevenskrbec.fragment;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.skrbectechnology.stevenskrbec.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ProjectsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ProjectsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProjectsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private OnFragmentInteractionListener mListener;

    public ProjectsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProjectsFragment newInstance(String param1, String param2) {
        ProjectsFragment fragment = new ProjectsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate((R.layout.fragment_projects),container,false );

        ImageView GirlImage = (ImageView)view.findViewById((R.id.girl_imageview));
        TextView GirlTextView = (TextView)view.findViewById(R.id.girl_textview);
        Spanned GIRLText = Html.fromHtml(getString(R.string.girl_text));
        GirlTextView.setText(GIRLText);
        GirlImage.setImageResource(R.drawable.girl2);

        ImageView KSUimage = (ImageView)view.findViewById((R.id.ksu_imageview));
        TextView KSUtextview = (TextView)view.findViewById(R.id.ksu_textview);
        Spanned KSUText = Html.fromHtml(getString(R.string.ksu_text));
        KSUtextview.setText(KSUText);
        KSUimage.setImageResource(R.drawable.ksuowlradio);

        ImageView CaribouImage = (ImageView)view.findViewById((R.id.caribou_imageviw));
        TextView CaribouTextView = (TextView)view.findViewById(R.id.caribou_textview);
        Spanned CaribouText = Html.fromHtml(getString(R.string.caribou_text));
        CaribouTextView.setText(CaribouText);
        CaribouImage.setImageResource(R.drawable.cariboucoffee);

        ImageView JdavisImage = (ImageView)view.findViewById((R.id.jdavis_imageview));
        TextView JdavisTextView = (TextView)view.findViewById(R.id.jdavis_textview);
        Spanned JdavisText = Html.fromHtml(getString(R.string.jdavis_text));
        JdavisTextView.setText(JdavisText);
        JdavisImage.setImageResource(R.drawable.jdaviswallpapergallery);

        ImageView WhenICraveImage = (ImageView)view.findViewById((R.id.whenicrave_imageview));
        TextView WhenICraveTextView = (TextView)view.findViewById(R.id.whenicrave_textview);
        Spanned WhenICraveText = Html.fromHtml(getString(R.string.whenicrave_text));
        WhenICraveTextView.setText(WhenICraveText);
        WhenICraveImage.setImageResource(R.drawable.whenicrave);

        ImageView S365Image = (ImageView)view.findViewById((R.id.shiftgears_imageview));
        TextView S365TextView = (TextView)view.findViewById(R.id.shiftgears_textview);
        Spanned S365Text = Html.fromHtml(getString(R.string.shiftgears365_text));
        S365TextView.setText(S365Text);
        S365Image.setImageResource(R.drawable.shiftgears365);





        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
