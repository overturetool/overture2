
package org.overture.ide.plugins.rttraceviewer.draw;

import java.util.Vector;

import org.overture.ide.plugins.rttraceviewer.data.*;
import org.overture.ide.plugins.rttraceviewer.view.GenericTabItem;

public abstract class TraceEventViewer extends TraceViewer {

	protected final Long RESOURCE_VINTERVAL = new Long(50L);
	
	//General
	public abstract void drawTimelines(GenericTabItem tab);
	
	public abstract void drawStaticItems(GenericTabItem tab, Vector<TraceCPU> cpus, Vector<TraceBus> buses);
	
	//Threads
	public abstract void drawThreadSwapOut(GenericTabItem tab, TraceCPU cpu, TraceThread thread);
	
	public abstract void drawDelayedThreadSwapIn(GenericTabItem tab,TraceCPU cpu, TraceThread thread);

	public abstract void drawThreadSwapIn(GenericTabItem tab, TraceCPU cpu, TraceThread thread);
	
	public abstract void drawThreadKill(GenericTabItem tab, TraceCPU cpu, TraceThread thread);

	public abstract void drawThreadCreate(GenericTabItem tab, TraceCPU cpu, TraceThread thread);

	//Messages
	public abstract void drawReplyRequest(GenericTabItem tab, TraceCPU cpu, TraceObject object, TraceBus bus, TraceOperation op);
	
	public abstract void drawMessageCompleted(GenericTabItem tab, TraceCPU cpu, TraceThread callerThread, TraceBus bus, TraceOperation op, TraceObject obj);

	public abstract void drawMessageRequest(GenericTabItem tab, TraceCPU cpu, TraceObject object, TraceBus bus, TraceOperation op);
	
	public abstract void drawMessageActivated(GenericTabItem tab, TraceCPU cpu, TraceObject object, TraceBus bus, TraceOperation op);

	//Operations
	public abstract void drawOpCompleted(GenericTabItem tab, TraceCPU cpu, TraceThread thread, TraceObject sourceObj, TraceOperation operation);

	public abstract void drawOpActivate(GenericTabItem tab, TraceCPU cpu, TraceThread thread, TraceObject destinationObj, TraceOperation operation);

	public abstract void drawOpRequest(GenericTabItem tab, TraceCPU cpu, TraceThread thread, TraceObject destinationObj, TraceOperation operation);

	public abstract void drawTimeMarker(GenericTabItem tab, Long markerTime);
	
}
