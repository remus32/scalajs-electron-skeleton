package io.atom.electron

import scala.scalajs.js

@js.native
trait EventEmitter extends js.Any {

  def on(event: String, listener: js.Function0[Unit]): EventEmitter = js.native

  def once(event: String, listener: js.Function0[Unit]): EventEmitter = js.native

  def removeListener(channel:String, callback: js.Function0[Unit]): Unit = js.native

  def removeAllListeners(channel:String): Unit = js.native
}
