package org.forironflower.vegalib.refection;

/* -------------------------------------------------------------------------------- *\
|*                                                                                  *|
|*    Copyright (C) 2023 forironflower                                              *|
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

/* -------------------------------------------------------------------------------- *\
|*                                                                                  *|
|* File:           ClassPathResourceReader.java                                     *|
|* Create Time:    2024/1/29 19:35                                                  *|
|* Author:         forironflower                                                    *|
|* EMail:          forironflower@hotmail.com                                        *|
|*                                                                                  *|
\* -------------------------------------------------------------------------------- */

import org.forironflower.vegalib.io.IOUtils;

/**
 * ClassPath 目录下的资源文件
 *
 * @author forironflower
 */
public class ClassPathResourceReader {

    /**
     * #brief: 使用字符串流读取文件中的所有数据作为字符串返回
     */
    public static byte[] read(String path) {
        return IOUtils.read(ClassUtils.getResourceStream(path));
    }

    /**
     * #brief: 使用字符串流读取文件中的所有数据作为字符串返回
     */
    public static String strread(String path) {
        return IOUtils.strread(ClassUtils.getResourceStream(path));
    }

}