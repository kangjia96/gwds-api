package cn.ikangjia.gwds.api.model;

import lombok.Data;

/**
 * @author kangJia
 * @email ikangjia.cn@outlook.com
 * @since 2024/12/25 16:34
 */
@Data
public class TreeQuery {
    private Long datasourceId;
    private TreeNode parent;
}
