package project;

import org.overture.codegen.runtime.*;

import java.util.*;


//@ nullable_by_default
@SuppressWarnings("all")
final public class Entry {
    /*@ public ghost static boolean invChecksOn = true; @*/
    private Entry() {
    }

    public static void typeUseOk() {
        Number ignorePattern_1 = 1L;

        //@ assert Utils.is_nat1(ignorePattern_1);
        Object even = 2L;

        //@ assert inv_Entry_No(even) && (inv_Entry_Even(even) || inv_Entry_Large(even));
        Number ignorePattern_2 = 3L;

        //@ assert Utils.is_nat1(ignorePattern_2);

        /* skip */
    }

    public static void typeUseNotOk() {
        IO.println("Before breaking named type invariant");

        {
            Object notLarge = 999L;
            //@ assert inv_Entry_No(notLarge) && (inv_Entry_Even(notLarge) || inv_Entry_Large(notLarge));
            IO.println("After breaking named type invariant");

            /* skip */
        }
    }

    public static Object Run() {
        typeUseOk();
        typeUseNotOk();

        return 0L;
    }

    public String toString() {
        return "Entry{}";
    }

    /*@ pure @*/
    /*@ helper @*/
    public static Boolean inv_Entry_No(final Object check_elem) {
        if ((Utils.equals(check_elem, null)) ||
                !(Utils.is_nat(check_elem) || Utils.is_real(check_elem))) {
            return false;
        }

        return true;
    }

    /*@ pure @*/
    /*@ helper @*/
    public static Boolean inv_Entry_Even(final Object check_ev) {
        if ((Utils.equals(check_ev, null)) || !(Utils.is_nat(check_ev))) {
            return false;
        }

        Number ev = ((Number) check_ev);

        return Utils.equals(Utils.mod(ev.longValue(), 2L), 0L);
    }

    /*@ pure @*/
    /*@ helper @*/
    public static Boolean inv_Entry_Large(final Object check_la) {
        if ((Utils.equals(check_la, null)) || !(Utils.is_real(check_la))) {
            return false;
        }

        Number la = ((Number) check_la);

        return la.doubleValue() > 1000L;
    }
}
