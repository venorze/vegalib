package com.thesmartkbd.vegalib.test;

/* -------------------------------------------------------------------------------- *\
|*                                                                                  *|
|*    Copyright (C) 2023 thesmartkbd                                                *|
|*                                                                                  *|
|*    This program is free software: you can redistribute it and/or modify          *|
|*    it under the terms of the GNU General Public License as published by          *|
|*    the Free Software Foundation, either version 3 of the License, or             *|
|*    (at your option) any later version.                                           *|
|*                                                                                  *|
|*    This program is distributed in the hope that it will be useful,               *|
|*    but WITHOUT ANY WARRANTY; without even the implied warranty of                *|
|*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                 *|
|*    GNU General Public License for more details.                                  *|
|*                                                                                  *|
|*    You should have received a copy of the GNU General Public License             *|
|*    along with this program.  If not, see <https://www.gnu.org/licenses/>.        *|
|*                                                                                  *|
|*    This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.    *|
|*    This is free software, and you are welcome to redistribute it                 *|
|*    under certain conditions; type `show c' for details.                          *|
|*                                                                                  *|
\* -------------------------------------------------------------------------------- */

/* Creates on 2023/9/6. */

import com.alibaba.fastjson.JSON;
import com.thesmartkbd.vegalib.Arrays;
import org.junit.Test;

import java.util.List;

import static com.thesmartkbd.vegalib.Arrays.array_copy_of;
import static com.thesmartkbd.vegalib.Objects.atos;
import static com.thesmartkbd.vegalib.collection.Collections.listOf;

/**
 * @author thesmartkbd
 */
@SuppressWarnings("all")
public class ArraysTest {

    @Test
    public void arraycopy_type_char() {
        char[] a = new char[] {
                'h', 'e', 'l', 'l', 'o',
                ',',
                ' ',
                'w', 'o', 'l', 'r', 'd', '!'
        };
        System.out.println(new String(array_copy_of(a, 7, -1)));
    }

    @Test
    public void arraycopy_type_object() {
        List<Character>   h = listOf('h');
        List<Character>   e = listOf('e');
        List<Character>  l0 = listOf('l');
        List<Character>  l1 = listOf('l');
        List<Character>   o = listOf('o');
        List<Character> dot = listOf(',');
        List<Character> emp = listOf(' ');
        List<Character>   w = listOf('w');
        List<Character>  o1 = listOf('o');
        List<Character>   l = listOf('l');
        List<Character>   r = listOf('r');
        List<Character>   d = listOf('d');
        List<Character> end = listOf('!');

        List[] original = new List[] {
                h,
                e,
                l0,
                l1,
                o,
                dot,
                emp,
                w,
                o1,
                l,
                r,
                d,
                end
        };

        List<Character>[] sliced = array_copy_of(original, 7, -1);
        System.out.println(JSON.toJSONString(sliced));
    }

    @Test
    public void copyof_type_string() {
        System.out.println(atos("Hello, Wolrd!", 7, 0));
    }

}