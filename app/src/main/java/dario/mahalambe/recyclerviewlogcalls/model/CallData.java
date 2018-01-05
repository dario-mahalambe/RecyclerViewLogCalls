package dario.mahalambe.recyclerviewlogcalls.model;

import java.util.ArrayList;
import java.util.List;

import dario.mahalambe.recyclerviewlogcalls.R;

/**
 * Created by Dario Mahalambe on 05/01/2018.
 */

public class CallData {

    private List<Call> mCallList = new ArrayList<Call>(){

        {
            add(new Call("", "", "", "Hoje", 0));
            add(new Call("Lucas", "Two days ago", "Mcel", "Hoje", R.drawable.letter_l));
            add(new Call("Lourenco", "Two days ago", "Mcel", "Hoje", R.drawable.letter_l));
            add(new Call("Xavier", "Two days ago", "Movitel", "Hoje", R.drawable.letter_x));

            add(new Call("", "", "", "Ontem", 0));
            add(new Call("Ricardo", "Two days ago", "Vodacom", "Ontem", R.drawable.letter_r));
            add(new Call("Lucas", "Two days ago", "Mcel", "Ontem", R.drawable.letter_l));
            add(new Call("Xavi", "Two days ago", "Mcel", "Ontem", R.drawable.letter_x));

        }
    };

    public List<Call> getmCallList() {
        return mCallList;
    }
}
