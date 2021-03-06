/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;map&gt;-point-events</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapPointEvents extends js.Object {

  /**
    * <p></p>Fires when a point is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.<p></p> <p>If the <code>series.allowPointSelect</code> option is true, the default action for the point's click event is to toggle the point's select state. Returning <code>false</code> cancels this action.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-point-events-click/" target="_blank">Click marker to display values</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-point-events-click-url/" target="_blank">go to URL</a>.
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse leaves the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    */
  val mouseOut: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse enters the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    */
  val mouseOver: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is removed using the <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    */
  val remove: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is selected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Report select and unselect</a>
    */
  val select: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is unselected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Report select and unselect</a>
    */
  val unselect: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is updated programmatically through the <code>.update()</code> method. One parameter, <code>event</code>, is passed to the function. The  new point options can be accessed through <code>event.options</code>. Returning <code>false</code> cancels the operation.
    */
  val update: js.UndefOr[js.Function] = js.undefined
}

object SeriesMapPointEvents {
  /**
    * @param click <p></p>Fires when a point is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.<p></p> <p>If the <code>series.allowPointSelect</code> option is true, the default action for the point's click event is to toggle the point's select state. Returning <code>false</code> cancels this action.</p>
    * @param mouseOut Fires when the mouse leaves the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param mouseOver Fires when the mouse enters the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param remove Fires when the point is removed using the <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param select Fires when the point is selected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param unselect Fires when the point is unselected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param update Fires when the point is updated programmatically through the <code>.update()</code> method. One parameter, <code>event</code>, is passed to the function. The  new point options can be accessed through <code>event.options</code>. Returning <code>false</code> cancels the operation.
    */
  def apply(click: js.UndefOr[js.Function] = js.undefined, mouseOut: js.UndefOr[js.Function] = js.undefined, mouseOver: js.UndefOr[js.Function] = js.undefined, remove: js.UndefOr[js.Function] = js.undefined, select: js.UndefOr[js.Function] = js.undefined, unselect: js.UndefOr[js.Function] = js.undefined, update: js.UndefOr[js.Function] = js.undefined): SeriesMapPointEvents = {
    val clickOuter: js.UndefOr[js.Function] = click
    val mouseOutOuter: js.UndefOr[js.Function] = mouseOut
    val mouseOverOuter: js.UndefOr[js.Function] = mouseOver
    val removeOuter: js.UndefOr[js.Function] = remove
    val selectOuter: js.UndefOr[js.Function] = select
    val unselectOuter: js.UndefOr[js.Function] = unselect
    val updateOuter: js.UndefOr[js.Function] = update
    new SeriesMapPointEvents {
      override val click: js.UndefOr[js.Function] = clickOuter
      override val mouseOut: js.UndefOr[js.Function] = mouseOutOuter
      override val mouseOver: js.UndefOr[js.Function] = mouseOverOuter
      override val remove: js.UndefOr[js.Function] = removeOuter
      override val select: js.UndefOr[js.Function] = selectOuter
      override val unselect: js.UndefOr[js.Function] = unselectOuter
      override val update: js.UndefOr[js.Function] = updateOuter
    }
  }
}
