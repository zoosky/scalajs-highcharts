/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-pie-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPiePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsPiePointEvents]] = js.undefined
}

object PlotOptionsPiePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsPiePointEvents]] = js.undefined): PlotOptionsPiePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsPiePointEvents]] = events
    new PlotOptionsPiePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsPiePointEvents]] = eventsOuter
    }
  }
}
