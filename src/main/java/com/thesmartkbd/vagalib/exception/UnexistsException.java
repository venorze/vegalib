package com.thesmartkbd.vagalib.exception;

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

/* Creates on 2023/4/30. */

/**
 * 不存在异常
 *
 * @author thesmartkbd
 */
public class UnexistsException extends FrameworkRuntimeException {

    public UnexistsException() {
        super();
    }

    public UnexistsException(String message) {
        super(message);
    }

    public UnexistsException(String message, Object... args) {
        super(message, args);
    }

    public UnexistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexistsException(String message, Throwable cause, Object... args) {
        super(message, args, cause);
    }

    public UnexistsException(Throwable cause) {
        super(cause);
    }

}