/*
 * Copyright 2011 Bill La Forge
 *
 * This file is part of AgileWiki and is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License (LGPL) as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 * or navigate to the following url http://www.gnu.org/licenses/lgpl-2.1.txt
 *
 * Note however that only Scala, Java and JavaScript files are being covered by LGPL.
 * All other files are covered by the Common Public License (CPL).
 * A copy of this license is also included and can be
 * found as well at http://www.opensource.org/licenses/cpl1.0.txt
 */

/**
 * <p>
 * The JActor project implements actors in Java that can process .8 Billion messages per second.
 * Project pages can be found on <a href="http://sourceforge.net/p/jactor/home/Home/">Sourceforge</a>
 * and <a href="https://github.com/laforge49/JActor">GitHub</a>.
 * </p>
 * <p>
 * This project is a reimplementation of a portion of the Scala project,
 * <a href="https://github.com/laforge49/Asynchronous-Functional-Programming/wiki">AsyncFP</a>.
 * </p>
 * <p>
 * Message passing between actors uses 2-way messages (request / response). This makes message passing
 * very much like method calls and most message passing is done synchronously. Mailboxes are used by actors
 * when passing messages between threads and are first class objects. This allows actors to share mailboxes
 * for improved performance.
 * </p>
 * <p>
 * When actors share a common mailbox, 847,457,627 messages are passed per second. Otherwise the rate drops to
 * 293,040,293 per second.
 * </p>
 * <p>
 * Asynchronous message passing is also supported, making it easy to use all the available hardware threads for
 * good vertical scalability. Request messages sent to an actor with an asynchronous mailbox (and the corresponding
 * responses) are passed asynchronously at a rate of 51,712,992 per second.
 * </p>
 * <p>
 * Tests were done on an Intel Core i5 CPU M 540 @ 2.53GHz, which has 4 hardware threads.
 * The times reported were best run in 5. Only standard switch settings were used--there was
 * NO compiler optimization.
 * </p>
 */

package org.agilewiki.jactor;
