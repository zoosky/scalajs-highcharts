/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;areasplinerange&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreasplinerange extends js.Object {

  /**
    * Allow this series' points to be selected by clicking on the markers or bars.
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
    * <dl>
    *   <dt>duration</dt>
    *   <dd>The duration of the animation in milliseconds.</dd>
    * <dt>easing</dt>
    * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    * </dl>
    * <p>
    * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/animation-slower/" target="_blank">Slower animation</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/animation-easing/" target="_blank">easing "swing" through jQuery UI</a>.
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Compare the values of the series against the first non-null, non-zero value in the visible range. The y axis will
    *  show percentage or absolute change depending on whether <code>compare</code> is set to <code>"percent"</code>
    *  or <code>"value"</code>. When this is applied to multiple series, it allows comparing the development
    *  of the series against each other.
    * @example Setting compare to 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-compare-percent/" target="_blank">
				percent</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-compare-value/" target="_blank">
				value</a>.
    * @since 1.0.1
    */
  val compare: js.UndefOr[String] = js.undefined

  /**
    * Whether to draw a line between points on either side of a null point, or render a gap between them.
    */
  val connectNulls: js.UndefOr[Boolean] = js.undefined

  /**
    * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    */
  val cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/cursor/" target="_blank">Pointer on a line graph</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:
    * 		    <ul>
    * 		    	<li>Solid</li>
    * 		    	<li>ShortDash</li>
    * 		    	<li>ShortDot</li>
    * 		    	<li>ShortDashDot</li>
    * 		    	<li>ShortDashDotDot</li>
    * 		    	<li>Dot</li>
    * 		    	<li>Dash</li>
    * 		    	<li>LongDash</li>
    * 		    	<li>DashDot</li>
    * 		    	<li>LongDashDot</li>
    * 		    	<li>LongDashDotDot</li>
    * 		    </ul>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/" target="_blank">Possible values demonstrated</a>
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * An array of data points for the series. For the <code>areasplinerange</code> series type, points can be given in the following ways:
    *  <ol>
    *  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,low,high</code>. If the first value is a string, it is
    *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
    *  	and <code>pointInterval</code> given in the series options.</p>
    * <pre>data: [
    *     [0, 4, 6], 
    *     [1, 3, 3], 
    *     [2, 0, 3]
    * ]</pre></li>
    * 
    * 
    * <li><p>An array of objects with named values. The objects are
    *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<areasplinerange>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
    * 
    * <pre>data: [{
    *     x: 1,
    *     low: 3,
    *     high: 1,
    *     name: "Point2",
    *     color: "#00FF00"
    * }, {
    *     x: 1,
    *     low: 0,
    *     high: 0,
    *     name: "Point1",
    *     color: "#FF00FF"
    * }]</pre></li>
    *  </ol>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesAreasplinerangeData] | js.Array[js.Any]]] = js.undefined

  val dataGrouping: js.UndefOr[CleanJsObject[SeriesAreasplinerangeDataGrouping]] = js.undefined

  /**
    * Extended data labels for range series types. Range series  data labels have no <code>x</code> and <code>y</code> options. Instead, they have <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and <code>yHigh</code> options to allow the higher and lower data label sets individually. 
    * @since 1.2.0
    */
  val dataLabels: js.UndefOr[CleanJsObject[SeriesAreasplinerangeDataLabels]] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesAreasplinerangeEvents]] = js.undefined

  /**
    * Fill color or gradient for the area. When <code>null</code>, the series' <code>color</code>  is  used with the series' <code>fillOpacity</code>.
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Fill opacity for the area. Note that when you set an explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you should define the opacity in the <code>fillColor</code> with an rgba color definition.
    */
  val fillOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines when to display a gap in the graph. A gap size of 5 means that if the distance between two points is greater than five times that of the two closest points, the  graph will be broken.</p>
    * 
    * <p>In practice, this option is most often used to visualize gaps in time series. In a stock chart, intraday data is available for daytime hours, while gaps will appear 	in nights and weekends.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-gapsize/" target="_blank">
				Setting the gap size to 2 introduces gaps for weekends in daily datasets.</a>
    */
  val gapSize: js.UndefOr[Double] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @since 1.2.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
    * @since 2.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * A separate color for the graph line. By default the line takes the <code>color</code> of the series, but the lineColor setting allows setting a separate color for the line without altering the <code>fillColor</code>.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Pixel width of the arearange graph line.
    * @since 1.2.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The line cap used for line ends and line joins on the graph.
    */
  val linecap: js.UndefOr[String] = js.undefined

  /**
    * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
    * @since 1.3
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[SeriesAreasplinerangePoint]] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, pointInterval defines the interval of the x values in milliseconds. For example, if a series contains one value each day, set pointInterval to <code>24 * 3600 * 1000</code>.</p>
    * <p>Since Highstock 2.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/pointinterval-pointstart/" target="_blank">
				Using pointStart and pointInterval</a>
    */
  val pointInterval: js.UndefOr[Double] = js.undefined

  /**
    * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/" target="_blank">One point a month</a>
    * @since 2.1.0
    */
  val pointIntervalUnit: js.UndefOr[String] = js.undefined

  /**
    * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
    * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
    * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
    * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
    * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/" target="_blank">Between in a column chart</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/" target="_blank">numeric placement for custom layout</a>.
    * @since 1.2.0
    */
  val pointPlacement: js.UndefOr[String | Double] = js.undefined

  /**
    * The width of each point on the x axis. For example in a column chart with one value each day, the pointRange would be 1 day (= 24 * 3600 * 1000 milliseconds). This is normally computed automatically, but this option can be used to override the automatic value.
    */
  val pointRange: js.UndefOr[Double] = js.undefined

  /**
    * If no x values are given for the points in a series, pointStart defines on what value to start. On a datetime X axis, the number will be given as milliseconds since 1970-01-01, for example <code>Date.UTC(2011, 0, 1)</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/pointinterval-pointstart/" target="_blank">
				Using pointStart and pointInterval</a>
    */
  val pointStart: js.UndefOr[Double] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to stack the values of each series on top of each other. Possible values
    *  are null to disable, "normal" to stack by value or "percent".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/stacking/" target="_blank">Area</a> with "normal" stacking.
    */
  val stacking: js.UndefOr[String] = js.undefined

  /**
    * A wrapper object for all the series options in specific states.
    */
  val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined

  /**
    * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    *  on a series isn't triggered until the mouse moves over another series, or out
    *  of the plot area. When false, the <code>mouseOut</code> event on a series is
    *  triggered when the mouse leaves the area around the series' graph or markers.
    *  This also implies the tooltip when not shared. When <code>stickyTracking</code> is false, the 
    *  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, candlesticks etc.
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    */
  val tooltip: js.UndefOr[CleanJsObject[SeriesAreasplinerangeTooltip]] = js.undefined

  /**
    * Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events.
    * @since 1.2.0
    */
  val trackByArea: js.UndefOr[Boolean] = js.undefined

  /**
    * When a series contains a data array that is longer than this, only one dimensional arrays of numbers,
    *  or two dimensional arrays with x and y values are allowed. Also, only the first
    *  point is tested, and the rest are assumed to be the same format. This saves expensive
    *  data checking and indexing in long series. Set it to <code>0</code> disable.
    */
  val turboThreshold: js.UndefOr[Double] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code>, <code>spline</code>, <code>candlestick</code> or <code>ohlc</code>. From version 1.1.7, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    */
  val `type`: String = "areasplinerange"

  /**
    * Set the initial visibility of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-visibility/" target="_blank">Hidden series</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * Define the visual z index of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * Defines the Axis on which the zones are applied.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
    * @since 2.1.0
    */
  val zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
    * @since 2.1.0
    */
  val zones: js.UndefOr[js.Array[CleanJsObject[SeriesAreasplinerangeZones]]] = js.undefined
}
