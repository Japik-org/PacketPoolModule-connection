package com.pro100kryto.server.modules.packetpool.connection;

import com.pro100kryto.server.module.IModuleConnection;
import com.pro100kryto.server.utils.datagram.packet.Packet;
import com.pro100kryto.server.utils.datagram.pool.PoolEmptyException;
import org.jetbrains.annotations.Nullable;

public interface IPacketPoolModuleConnection extends IModuleConnection {
    @Nullable
    Packet getNextPacket() throws PoolEmptyException;
    int getMaxCapacity();
    int getRemainingCapacity();
}
