package com.example.demoapi.mapper;

import com.example.demoapi.dto.HtDto;
import com.example.demoapi.model.HtModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-01T16:37:38+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class HtMapperImpl implements HtMapper {

    @Override
    public HtDto modeltoDto(HtModel htModel) {
        if ( htModel == null ) {
            return null;
        }

        HtDto htDto = new HtDto();

        htDto.setIdht( htModel.getIdht() );
        htDto.setHtcol1( htModel.getHtcol1() );
        htDto.setHtcol2( htModel.getHtcol2() );

        return htDto;
    }

    @Override
    public HtModel dtoToModel(HtDto htDto) {
        if ( htDto == null ) {
            return null;
        }

        HtModel htModel = new HtModel();

        htModel.setIdht( htDto.getIdht() );
        htModel.setHtcol1( htDto.getHtcol1() );
        htModel.setHtcol2( htDto.getHtcol2() );

        return htModel;
    }

    @Override
    public List<HtDto> modelsToDtos(List<HtModel> htModelList) {
        if ( htModelList == null ) {
            return null;
        }

        List<HtDto> list = new ArrayList<HtDto>( htModelList.size() );
        for ( HtModel htModel : htModelList ) {
            list.add( modeltoDto( htModel ) );
        }

        return list;
    }
}
